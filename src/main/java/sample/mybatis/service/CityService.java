package sample.mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import sample.mybatis.domain.City;
import sample.mybatis.mapper.CityMapper;


/**
 * Created by wanlichao on 2016/10/26 0026.
 */
public class CityService {
    @Autowired
    private CityMapper mapper;

    @Transactional
    public void updateCountryById(City city){
        System.out.println(mapper.updateCountryById(city));
        //throw new NumberFormatException();
    }

    public City selectCityById(int city_id){
        return mapper.selectCityById(city_id);
    }
}
