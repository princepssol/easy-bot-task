package com.easybot.hardwarestore.repository;

import com.easybot.hardwarestore.model.Items;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Items, Long> {
}