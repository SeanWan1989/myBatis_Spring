package sample.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sample.mybatis.dao.CityDao;
import sample.mybatis.service.BlogService;
import sample.mybatis.service.CityService;

@SpringBootApplication
public class SampleXmlApplication implements CommandLineRunner {

	@Autowired
	private CityDao cityDao;
	@Autowired
	private CityService cityService;
	@Autowired
	private BlogService blogService;
	
	public static void main(String[] args) {
		SpringApplication.run(SampleXmlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		City city = this.cityService.selectCityById(1);
//		System.out.println(city);
//		city.setCountry("China");
//		this.cityService.updateCountryById(city);
		blogService.show("1");
	}

}
