package com.easybot.hardwarestore.service;

import com.easybot.hardwarestore.api.dto.MonitorDTO;
import com.easybot.hardwarestore.model.Monitor;

import java.util.Collection;

public interface MonitorService {
    Collection<Monitor> getComputers();

    Monitor getMonitor(Long id);

    Long createMonitor(Monitor entity);

    void updateMonitor(Long id, Monitor entity);
}
