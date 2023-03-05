package com.univer.masterat.api.service;

import com.univer.masterat.api.abstractimpl.AbstractDAO;
import com.univer.masterat.api.abstractimpl.AbstractService;
import com.univer.masterat.api.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class CityService extends AbstractService<City, Long> {

    @Autowired
    public CityService(AbstractDAO<City, Long> dao) {
        super(dao);
    }
}
