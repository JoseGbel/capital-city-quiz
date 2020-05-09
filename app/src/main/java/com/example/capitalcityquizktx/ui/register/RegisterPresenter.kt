package com.example.capitalcityquizktx.ui.register

import android.util.Log
import com.example.capitalcityquizktx.model.ServiceAPIFactory
import com.example.capitalcityquizktx.model.register.UserDetails
import com.example.capitalcityquizktx.model.register.UserExistence
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class RegisterPresenter (val view : IRegisterView){

    private val service = ServiceAPIFactory.createService()

    fun createNewUser(userDetails: UserDetails) {

        GlobalScope.launch (Dispatchers.Default) {
            // confirm email and username does not exist in database
            val call = service.verifyUserIsNotInDatabase(userDetails.username, userDetails.email)

            call.enqueue(object : Callback<UserExistence?> {
                override fun onResponse(
                    call: Call<UserExistence?>,
                    response: Response<UserExistence?>
                ) {
                    if(response.body() != null) {
                        if (response.body()!!.emailInDatabase) {
                            // NOTIFY THE UI ABOUT EMAIL
                            view.emailIsInDatabaseValidation()
                        }

                        if (response.body()!!.usernameInDatabase) {
                            // NOTIFY THE UI ABOUT USERNAME
                            view.usernameInDatabaseValidation()
                        }

                        if(!response.body()!!.usernameInDatabase &&
                            !response.body()!!.emailInDatabase){
                            val call = service.createUser(userDetails)

                            call.enqueue(object : Callback<Boolean?> {
                                override fun onResponse(
                                    call: Call<Boolean?>,
                                    response: Response<Boolean?>
                                ) {
                                    if(response.body()!!) {
                                        Log.d("RETRONET", "USER CREATED")
                                        // go to success fragment
                                    }
                                    else {
                                        Log.d("RETRONET", "USER WAS NOT CREATED")
                                        view.displayAccountErrorDialog()
                                    }
                                }

                                override fun onFailure(call: Call<Boolean?>, t: Throwable) {
                                    call.cancel()
                                    view.displayUnableToConntectDialog()
                                    Log.d("RETRONET", "FAILED")
                                }
                            })
                        }
                    }
                }

                override fun onFailure(call: Call<UserExistence?>, t: Throwable) {
                    call.cancel()
                    Log.d("RETRONET", "FAILED")
                }
            })
        }
    }
}