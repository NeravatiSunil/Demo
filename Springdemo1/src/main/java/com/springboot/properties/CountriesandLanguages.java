package com.springboot.properties;

import java.util.Properties;

public class CountriesandLanguages {
	private Properties countryAndLangs;

	@Override
	public String toString() {
		return "CountriesandLanguages [countryAndLangs=" + countryAndLangs + "]";
	}

	public Properties getCountryAndLangs() {
		return countryAndLangs;
	}

	public void setCountryAndLangs(Properties countryAndLangs) {
		this.countryAndLangs = countryAndLangs;
	}

}
