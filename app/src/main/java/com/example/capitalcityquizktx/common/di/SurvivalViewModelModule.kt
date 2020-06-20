package com.example.capitalcityquizktx.common.di

import com.example.capitalcityquizktx.domain.viewmodels.SurvivalViewModel
import kotlinx.coroutines.Dispatchers
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

/**

J. Garcia CapitalCityQuiz in Kotlin 10/12/2019

 */
object SurvivalViewModelModule {
    fun getModule() : Module = module {
            factory { Dispatchers.Default  }
            viewModel {
                SurvivalViewModel(
                    get(),
                    get()
                )
            }
    }
}