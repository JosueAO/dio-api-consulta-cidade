package com.github.JosueAO.citiesapi.repository;

import com.github.JosueAO.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
