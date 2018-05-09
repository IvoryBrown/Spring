package com.sevice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sevice.deivce.service.IDeviceService;
import com.sevice.device.bean.Device;

@Controller
public class MyController {

	@Autowired
	IDeviceService deviceService;

	@RequestMapping(value = { "/index" }, method = RequestMethod.GET)
	public String home(Model model) {
		return "index";
	}

	@RequestMapping(value = { "/device" }, method = RequestMethod.GET)
	public String device(Model model) {

		List<Device> device = (List<Device>) deviceService.findAll();

		model.addAttribute("deviceHTML", device);
		System.out.println(device.toString());
		return "device";
	}
}
