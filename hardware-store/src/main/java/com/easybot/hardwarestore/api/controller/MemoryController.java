package com.easybot.hardwarestore.api.controller;

import com.easybot.hardwarestore.api.dto.MemoryDTO;
import com.easybot.hardwarestore.api.dto.response.ResponseCreatedDTO;
import com.easybot.hardwarestore.api.dto.response.ResponseUpdatedDTO;
import com.easybot.hardwarestore.api.mapper.EntityMapper;
import com.easybot.hardwarestore.model.Mem;
import com.easybot.hardwarestore.service.MemoryService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Positive;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/memory")
public class MemoryController {
    private final MemoryService service;
    private final EntityMapper<Mem, MemoryDTO> mapper;


    public MemoryController(MemoryService service, EntityMapper<Mem, MemoryDTO> mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<MemoryDTO> getMemorys() {
        return service.getMemorys().stream()
                .map(mapper::fromEntity)
                .collect(Collectors.toList());
    }


    @GetMapping(
            path = "/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public MemoryDTO getMemory(@PathVariable @Positive Long id) {
        Mem mem = service.getMemory(id);
        return mapper.fromEntity(mem);
    }

    @PostMapping(
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseCreatedDTO createMemory(@Valid @RequestBody MemoryDTO dto) {
        Long id = service.createMemory(mapper.toEntity(dto));
        return ResponseCreatedDTO.createdBuilder()
                .id(id)
                .build();
    }

    @PostMapping(
            path = "/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseUpdatedDTO updateMemory(
            @Valid @RequestBody MemoryDTO dto,
            @PathVariable @Positive Long id
    ) {
        service.updateMemory(id, mapper.toEntity(dto));
        return ResponseUpdatedDTO.updatedBuilder()
                .id(id)
                .build();
    }
}
