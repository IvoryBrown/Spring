package com.sevice.deivce.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sevice.device.bean.Device;
import com.sevice.device.repository.DeviceRepository;

@Service
public class DeviceService implements IDeviceService {

    @Autowired
    private DeviceRepository deviceRepository;

    @Override
    public List<Device> findAll() {

        List<Device> device = (List<Device>) deviceRepository.findAll();
        
        return device;
    }
}