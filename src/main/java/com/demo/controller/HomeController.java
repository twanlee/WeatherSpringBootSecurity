package com.demo.controller;

import com.demo.model.Weather;
import com.demo.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private WeatherService weatherService;

    @GetMapping("/")
    public String getHome(){
        return "home";
    }
    @GetMapping("/weather")
    public ModelAndView getWeather(){
        ModelAndView modelAndView = new ModelAndView("weather");
        List<Weather> weathers = weatherService.findAll();

        modelAndView.addObject("weathers",weathers);
        return modelAndView;
    }
}
