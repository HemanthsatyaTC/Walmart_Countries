package com.sample.walmart_countries.domain.usecase

import com.sample.walmart_countries.data.repository.CountryRepository
import com.sample.walmart_countries.domain.model.Country

class GetCountriesUseCase {
    private val countryRepository = CountryRepository()

    suspend fun execute(): List<Country> {
        return countryRepository.getCountries()
    }
}