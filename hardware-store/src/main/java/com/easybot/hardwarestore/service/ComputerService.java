package com.easybot.hardwarestore.service;

import com.easybot.hardwarestore.model.Computer;

import java.util.Collection;

public interface ComputerService {
    Collection<Computer> getComputers();

    Computer getComputer(Long id);

    Long createComputer(Computer entity);

    void updateComputer(Long id, Computer entity);
}
