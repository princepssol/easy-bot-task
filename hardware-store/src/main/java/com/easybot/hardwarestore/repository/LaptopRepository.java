package com.easybot.hardwarestore.repository;

import com.easybot.hardwarestore.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepository extends JpaRepository<Laptop, Long> {
}