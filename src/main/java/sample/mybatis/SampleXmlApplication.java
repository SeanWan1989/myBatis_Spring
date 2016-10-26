/**
 *    Copyright 2015-2016 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package sample.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sample.mybatis.dao.CityDao;
import sample.mybatis.domain.City;
import sample.mybatis.service.CityService;

@SpringBootApplication
public class SampleXmlApplication implements CommandLineRunner {

	@Autowired
	private CityDao cityDao;
	@Autowired
	private CityService cityService;
	
	public static void main(String[] args) {
		SpringApplication.run(SampleXmlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		City city = this.cityService.selectCityById(1);
		System.out.println(city);
		city.setCountry("nimeiadddddddddddddddd");
		this.cityService.updateCountryById(city);
	}

}
