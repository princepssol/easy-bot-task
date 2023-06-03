package com.easybot.hardwarestore.service.impl;

import com.easybot.hardwarestore.exceptions.ThereIsNoSuchElementException;
import com.easybot.hardwarestore.model.Laptop;
import com.easybot.hardwarestore.repository.LaptopRepository;
import com.easybot.hardwarestore.service.LaptopService;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class LaptopServiceImpl implements LaptopService {
    private final LaptopRepository repository;

    public LaptopServiceImpl(LaptopRepository repository) {
        this.repository = repository;
    }

    @Override
    public Collection<Laptop> getLaptops() {
        return repository.findAll();
    }

    @Override
    public Laptop getLaptop(Long id) {
        return repository.findByPublicId(id)
                .orElseThrow(ThereIsNoSuchElementException::new);
    }

    @Override
    public Long createLaptop(Laptop entity) {
        return repository.save(entity).getId();
    }

    @Override
    public void updateLaptop(Long publicId, Laptop entity) {
        Long id = repository.getIdByPublicId(publicId)
                .orElseThrow(ThereIsNoSuchElementException::new);
        entity.setId(id);
        repository.save(entity);
    }
}
