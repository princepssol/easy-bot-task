package com.easybot.hardwarestore.service;

import com.easybot.hardwarestore.model.Mem;

import java.util.Collection;

public interface MemoryService {
    Collection<Mem> getMemorys();

    Mem getMemory(Long id);

    Long createMemory(Mem entity);

    void updateMemory(Long id, Mem entity);
}
