package com.easybot.hardwarestore.repository;

import com.easybot.hardwarestore.model.Memory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemoryRepository extends JpaRepository<Memory, Long> {
}