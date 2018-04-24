package com.sevice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sevice.bean.City;
import com.sevice.service.ICityService;

@Controller
public class MyController {
    
    @Autowired
    ICityService cityService;

    @GetMapping("/showCities")
    public String findCities(Model model) {
        
        List<City> cities = (List<City>) cityService.findAll();
        
        model.addAttribute("cities", cities);
        
        return "showCities";
    }
    @RequestMapping(value = {"/table"}, method = RequestMethod.GET)
    public String table(Model model) {
    	
   	List<City> cities = (List<City>) cityService.findAll();
   	
  	model.addAttribute("cities", cities);
    	
    	return "table";
    }
}
