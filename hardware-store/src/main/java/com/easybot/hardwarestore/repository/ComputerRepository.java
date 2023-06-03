package com.easybot.hardwarestore.repository;

import com.easybot.hardwarestore.model.Computer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;

import java.util.Optional;

public interface ComputerRepository extends JpaRepository<Computer, Long> {
    Optional<Computer> findByPublicId(@NonNull Long puplicId);

    @Query("select d.id from Computer d where d.publicId = :publicId")
    Optional<Long> getIdByPublic_id(@NonNull Long publicId);

}