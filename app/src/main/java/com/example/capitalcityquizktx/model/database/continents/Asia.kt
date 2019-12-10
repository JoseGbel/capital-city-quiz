package com.example.capitalcityquizktx.model.database.continents

import com.example.capitalcityquizktx.model.database.Continent
import kotlinx.android.parcel.Parcelize

/**

    J. Garcia CapitalCityQuiz in Kotlin 10/12/2019

 */
@Parcelize
object Asia : Continent(continentName = "Asia", totalCountries = 44){
    override fun toString(): String {
        //TODO Find a way to enable locale translation feature to this method. getStringById(R.id...)
        return "Asia"
    }
}