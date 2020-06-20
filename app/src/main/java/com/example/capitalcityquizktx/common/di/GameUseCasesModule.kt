package com.example.capitalcityquizktx.common.di

import com.example.capitalcityquizktx.domain.GameInteractor
import com.example.capitalcityquizktx.domain.GameUseCases
import com.example.capitalcityquizktx.data.CountryRepository
import org.koin.core.module.Module
import org.koin.dsl.module

/**

J. Garcia CapitalCityQuiz in Kotlin 10/12/2019

 */
object GameUseCasesModule {
    fun getModules() : Module =  module {
        fun provideGameInteractor(countryRepository: CountryRepository) : GameUseCases {
            return GameInteractor(countryRepository)
        }
        single { provideGameInteractor(get()) }
        single { GameInteractor (get())}
    }
}