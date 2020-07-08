package com.demo.service.impl;

import com.demo.model.Weather;
import com.demo.repository.WeatherRepo;
import com.demo.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeatherServiceImpl implements WeatherService {
    @Autowired
    private WeatherRepo weatherRepo;

    @Override
    public List<Weather> findAll() {
        return (List<Weather>) weatherRepo.findAll();
    }
}
