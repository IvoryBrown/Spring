package com.sevice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sevice.bean.Device;
import com.sevice.service.ICityService;

@Controller
public class MyController {
    
    @Autowired
    ICityService cityService;


    @RequestMapping(value = {"/deviceClient"}, method = RequestMethod.GET)
    public String tableq(Model model) {
    	
   	List<Device> cities = (List<Device>) cityService.findAll();
   	
  	model.addAttribute("cities", cities);
    	System.out.println(cities.toString());
    	return "deviceClient";
    }
    @RequestMapping(value = {"/index"}, method = RequestMethod.GET)
    public String table(Model model) {
    	
    	List<Device> cities = (List<Device>) cityService.findAll();
    	
    	model.addAttribute("cities", cities);
    	System.out.println(cities.toString());
    	return "index";
    }
}
