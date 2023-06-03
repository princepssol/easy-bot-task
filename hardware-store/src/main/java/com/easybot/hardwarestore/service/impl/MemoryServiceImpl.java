package com.easybot.hardwarestore.service.impl;

import com.easybot.hardwarestore.exceptions.ThereIsNoSuchElementException;
import com.easybot.hardwarestore.model.Mem;
import com.easybot.hardwarestore.repository.MemoryRepository;
import com.easybot.hardwarestore.service.MemoryService;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class MemoryServiceImpl implements MemoryService {
    private final MemoryRepository repository;

    public MemoryServiceImpl(MemoryRepository repository) {
        this.repository = repository;
    }

    @Override
    public Collection<Mem> getMemorys() {
        return repository.findAll();
    }

    @Override
    public Mem getMemory(Long id) {
        return repository.findByPublicId(id)
                .orElseThrow(ThereIsNoSuchElementException::new);
    }

    @Override
    public Long createMemory(Mem entity) {
        return repository.save(entity).getId();
    }

    @Override
    public void updateMemory(Long publicId, Mem entity) {
        Long id = repository.getIdByPublicId(publicId)
                .orElseThrow(ThereIsNoSuchElementException::new);
        entity.setId(id);
        repository.save(entity);
    }
}
