package com.javarush.drogunov.redis;

import com.javarush.drogunov.domain.Continent;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.Set;

public class CityCountry {
    private Integer id;
    private String name;
    private String district;
    private Integer population;
    private String countryCode;
    private String alternativeCountCode;
    private String countryName;
    private Continent continent;
    private String countryRegion;
    private BigDecimal countrySurfaceArea;
    private Integer countryPopulation;
    private Set<Language> languages;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CityCountry country = (CityCountry) o;
        return Objects.equals(id, country.id) && Objects.equals(name, country.name) && Objects.equals(district, country.district) && Objects.equals(population, country.population) && Objects.equals(countryCode, country.countryCode) && Objects.equals(alternativeCountCode, country.alternativeCountCode) && Objects.equals(countryName, country.countryName) && continent == country.continent && Objects.equals(countryRegion, country.countryRegion) && Objects.equals(countrySurfaceArea, country.countrySurfaceArea) && Objects.equals(countryPopulation, country.countryPopulation) && Objects.equals(languages, country.languages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, district, population, countryCode, alternativeCountCode, countryName, continent, countryRegion, countrySurfaceArea, countryPopulation, languages);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getAlternativeCountCode() {
        return alternativeCountCode;
    }

    public void setAlternativeCountCode(String alternativeCountCode) {
        this.alternativeCountCode = alternativeCountCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    public String getCountryRegion() {
        return countryRegion;
    }

    public void setCountryRegion(String countryRegion) {
        this.countryRegion = countryRegion;
    }

    public BigDecimal getCountrySurfaceArea() {
        return countrySurfaceArea;
    }

    public void setCountrySurfaceArea(BigDecimal countrySurfaceArea) {
        this.countrySurfaceArea = countrySurfaceArea;
    }

    public Integer getCountryPopulation() {
        return countryPopulation;
    }

    public void setCountryPopulation(Integer countryPopulation) {
        this.countryPopulation = countryPopulation;
    }

    public Set<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(Set<Language> languages) {
        this.languages = languages;
    }
}
