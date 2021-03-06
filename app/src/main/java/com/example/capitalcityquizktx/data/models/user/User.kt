package com.example.capitalcityquizktx.data.models.user

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**

    J. Garcia CapitalCityQuiz in Kotlin 10/12/2019

 */
@Entity(tableName = "users")
data class User(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "user_id")     val userId: Long,
    @ColumnInfo(name = "user_name")   val userName: String,
                                      val password: String,
    @ColumnInfo(name = "first_name")  val firstName: String,
    @ColumnInfo(name = "last_name")   val lastName: String,
                                      val email: String
)