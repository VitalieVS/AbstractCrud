package com.univer.masterat.api.controller;

import com.univer.masterat.api.abstractimpl.AbstractController;
import com.univer.masterat.api.model.City;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/city")
public class CityController extends AbstractController<City, Long> {

}