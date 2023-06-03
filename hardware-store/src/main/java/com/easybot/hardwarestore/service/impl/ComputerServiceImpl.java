package com.easybot.hardwarestore.service.impl;

import com.easybot.hardwarestore.exceptions.ThereIsNoSuchElementException;
import com.easybot.hardwarestore.model.Computer;
import com.easybot.hardwarestore.repository.ComputerRepository;
import com.easybot.hardwarestore.service.ComputerService;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ComputerServiceImpl implements ComputerService {
    private final ComputerRepository repository;

    public ComputerServiceImpl(ComputerRepository repository) {
        this.repository = repository;
    }

    @Override
    public Collection<Computer> getComputers() {
        return repository.findAll();
    }

    @Override
    public Computer getComputer(Long id) {
        return repository.findByPublicId(id)
                .orElseThrow(ThereIsNoSuchElementException::new);
    }

    @Override
    public Long createComputer(Computer entity) {
        return repository.save(entity).getId();
    }

    @Override
    public void updateComputer(Long publicId, Computer entity) {
        Long id = repository.getIdByPublic_id(publicId)
                .orElseThrow(ThereIsNoSuchElementException::new);
        entity.setId(id);
        repository.save(entity);
    }
}
