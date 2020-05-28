package com.sh.redis.controller;

import com.sh.redis.entity.City;
import com.sh.redis.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/city")
@RestController
public class CityRestController {

    @Autowired
   private CityService cityService;


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public City findOneCity(@PathVariable("id") Long id) {
        return cityService.findCityById(id);
    }

    @RequestMapping(value = "/saveCity", method = RequestMethod.POST)
    public void saveCity(@RequestBody City city) {
        cityService.saveCity(city);
    }

    @RequestMapping(value = "/updateCity", method = RequestMethod.PUT)
    public void updateCity(@RequestBody City city) {
        cityService.updateCity(city);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteCityById(@PathVariable("id") Long id) {
        cityService.deleteCity(id);
    }
}