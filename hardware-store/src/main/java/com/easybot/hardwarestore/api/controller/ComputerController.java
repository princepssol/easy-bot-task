package com.easybot.hardwarestore.api.controller;

import com.easybot.hardwarestore.api.dto.ComputerDTO;
import com.easybot.hardwarestore.api.dto.response.ResponseCreatedDTO;
import com.easybot.hardwarestore.api.dto.response.ResponseUpdatedDTO;
import com.easybot.hardwarestore.api.mapper.EntityMapper;
import com.easybot.hardwarestore.model.Computer;
import com.easybot.hardwarestore.service.ComputerService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Positive;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/computer")
public class ComputerController {

    private final ComputerService service;
    private final EntityMapper<Computer, ComputerDTO> mapper;

    public ComputerController(ComputerService service, EntityMapper<Computer, ComputerDTO> mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<ComputerDTO> getComputers() {
        return service.getComputers().stream()
                .map(mapper::fromEntity)
                .collect(Collectors.toList());
    }


    @GetMapping(
            path = "/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ComputerDTO getComputer(@PathVariable @Positive Long id) {
        Computer computer = service.getComputer(id);
        return mapper.fromEntity(computer);
    }

    @PostMapping(
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseCreatedDTO createComputer(@Valid @RequestBody ComputerDTO dto) {
        Long id = service.createComputer(mapper.toEntity(dto));
        return ResponseCreatedDTO.createdBuilder()
                .id(id)
                .build();
    }

    @PostMapping(
            path = "/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseUpdatedDTO updateComputer(
            @Valid @RequestBody ComputerDTO dto,
            @PathVariable @Positive Long id
            ) {
        service.updateComputer(id, mapper.toEntity(dto));
        return ResponseUpdatedDTO.updatedBuilder()
                .id(id)
                .build();
    }
}
