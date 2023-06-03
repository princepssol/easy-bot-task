package com.easybot.hardwarestore.service.impl;

import com.easybot.hardwarestore.exceptions.ThereIsNoSuchElementException;
import com.easybot.hardwarestore.model.Monitor;
import com.easybot.hardwarestore.repository.MonitorRepository;
import com.easybot.hardwarestore.service.MonitorService;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class MonitorServiceImpl implements MonitorService {

    private final MonitorRepository repository;

    public MonitorServiceImpl(MonitorRepository repository) {
        this.repository = repository;
    }

    @Override
    public Collection<Monitor> getComputers() {
        return repository.findAll();
    }

    @Override
    public Monitor getMonitor(Long id) {
        return repository.findByPublicId(id)
                .orElseThrow(ThereIsNoSuchElementException::new);
    }

    @Override
    public Long createMonitor(Monitor entity) {
        return repository.save(entity).getId();
    }

    @Override
    public void updateMonitor(Long publicId, Monitor entity) {
        Long id = repository.getIdByPublicId(publicId)
                .orElseThrow(ThereIsNoSuchElementException::new);
        entity.setId(id);
        repository.save(entity);
    }
}
