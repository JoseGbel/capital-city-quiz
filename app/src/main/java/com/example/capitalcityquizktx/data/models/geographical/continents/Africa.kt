package com.example.capitalcityquizktx.data.models.geographical.continents

import com.example.capitalcityquizktx.data.models.geographical.Continent
import kotlinx.parcelize.Parcelize

/**

    J. Garcia CapitalCityQuiz in Kotlin 10/12/2019

 */
@Parcelize
object Africa : Continent(continentName = "Africa", totalCountries = 53){
    override fun toString(): String {
        return "Africa"
    }
}