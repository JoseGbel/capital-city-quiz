package com.example.capitalcityquizktx.UI.SurvivalMode

import androidx.lifecycle.MutableLiveData
import com.example.capitalcityquizktx.Database.Continent

interface GameConfigSurvivalModeView {

    val continentsList: MutableLiveData<List<Continent>>

    fun showQuestionsNumberSelection()

    fun showTimesetSelection()

    fun hideQuestionsNumberSelection()

    fun hideTimesetSelection()
}
