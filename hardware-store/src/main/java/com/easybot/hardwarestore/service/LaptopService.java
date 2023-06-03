package com.easybot.hardwarestore.service;

import com.easybot.hardwarestore.model.Laptop;

import java.util.Collection;

public interface LaptopService {

    Collection<Laptop> getLaptops();

    Laptop getLaptop(Long id);

    Long createLaptop(Laptop entity);

    void updateLaptop(Long id, Laptop entity);
}
