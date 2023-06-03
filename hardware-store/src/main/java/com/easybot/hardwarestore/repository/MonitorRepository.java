package com.easybot.hardwarestore.repository;

import com.easybot.hardwarestore.model.Computer;
import com.easybot.hardwarestore.model.Monitor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;

import java.util.Optional;

public interface MonitorRepository extends JpaRepository<Monitor, Long> {
    Optional<Monitor> findByPublicId(@NonNull Long puplicId);

    @Query("select d.id from Monitor d where d.publicId = :publicId")
    Optional<Long> getIdByPublicId(@NonNull Long publicId);
}