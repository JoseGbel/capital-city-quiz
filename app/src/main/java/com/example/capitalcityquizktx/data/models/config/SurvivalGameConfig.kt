package com.example.capitalcityquizktx.data.models.config

import android.os.Parcelable
import com.example.capitalcityquizktx.data.models.geographical.Continent
import kotlinx.parcelize.Parcelize

/**

J. Garcia CapitalCityQuiz in Kotlin 10/12/2019

 */
@Parcelize
open class SurvivalGameConfig(
    val continents: List<Continent>?,
    val numQuestions: Int,
    val timeLimit: Int) : GameConfig, Parcelable