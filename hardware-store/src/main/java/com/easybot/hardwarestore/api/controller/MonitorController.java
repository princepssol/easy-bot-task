package com.easybot.hardwarestore.api.controller;

import com.easybot.hardwarestore.api.dto.MonitorDTO;
import com.easybot.hardwarestore.api.dto.response.ResponseCreatedDTO;
import com.easybot.hardwarestore.api.dto.response.ResponseUpdatedDTO;
import com.easybot.hardwarestore.api.mapper.EntityMapper;
import com.easybot.hardwarestore.model.Monitor;
import com.easybot.hardwarestore.service.MonitorService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Positive;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/monitor")
public class MonitorController {

    private final MonitorService service;
    private final EntityMapper<Monitor, MonitorDTO> mapper;

    public MonitorController(MonitorService service, EntityMapper<Monitor, MonitorDTO> mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<MonitorDTO> getMonitors() {
        return service.getComputers().stream()
                .map(mapper::fromEntity)
                .collect(Collectors.toList());
    }


    @GetMapping(
            path = "/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public MonitorDTO getMonitor(@PathVariable @Positive Long id) {
        Monitor monitor = service.getMonitor(id);
        return mapper.fromEntity(monitor);
    }

    @PostMapping(
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseCreatedDTO createMonitor(@Valid @RequestBody MonitorDTO dto) {
        Long id = service.createMonitor(mapper.toEntity(dto));
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
            @Valid @RequestBody MonitorDTO dto,
            @PathVariable @Positive Long id
    ) {
        service.updateMonitor(id, mapper.toEntity(dto));
        return ResponseUpdatedDTO.updatedBuilder()
                .id(id)
                .build();
    }
}
