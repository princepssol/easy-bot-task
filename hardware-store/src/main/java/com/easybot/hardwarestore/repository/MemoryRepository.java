package com.easybot.hardwarestore.repository;

import com.easybot.hardwarestore.model.Mem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;

import java.util.Optional;

public interface MemoryRepository extends JpaRepository<Mem, Long> {
    Optional<Mem> findByPublicId(Long id);

    @Query("select d.id from Mem d where d.publicId = :publicId")
    Optional<Long> getIdByPublicId(@NonNull Long publicId);
}