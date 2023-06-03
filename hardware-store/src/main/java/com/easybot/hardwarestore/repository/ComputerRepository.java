package com.easybot.hardwarestore.repository;

import com.easybot.hardwarestore.model.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComputerRepository extends JpaRepository<Computer, Long> {
}