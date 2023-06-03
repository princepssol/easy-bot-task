package com.easybot.hardwarestore.repository;

import com.easybot.hardwarestore.model.Monitor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonitorRepository extends JpaRepository<Monitor, Long> {
}