package com.demo.service;

import com.demo.model.Weather;

import java.util.List;

public interface WeatherService {
    List<Weather> findAll();
}
