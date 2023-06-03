package com.easybot.hardwarestore.repository;

import com.easybot.hardwarestore.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;

import java.util.Optional;

public interface LaptopRepository extends JpaRepository<Laptop, Long> {
    Optional<Laptop> findByPublicId(Long id);

    @Query("select d.id from Laptop d where d.publicId = :publicId")
    Optional<Long> getIdByPublicId(@NonNull Long publicId);
}