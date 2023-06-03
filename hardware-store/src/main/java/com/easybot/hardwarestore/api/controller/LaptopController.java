package com.easybot.hardwarestore.api.controller;

import com.easybot.hardwarestore.api.dto.LaptopDTO;
import com.easybot.hardwarestore.api.dto.response.ResponseCreatedDTO;
import com.easybot.hardwarestore.api.dto.response.ResponseUpdatedDTO;
import com.easybot.hardwarestore.api.mapper.EntityMapper;
import com.easybot.hardwarestore.model.Laptop;
import com.easybot.hardwarestore.service.LaptopService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Positive;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/laptop")
public class LaptopController {
    private final LaptopService service;
    private final EntityMapper<Laptop, LaptopDTO> mapper;


    public LaptopController(LaptopService service, EntityMapper<Laptop, LaptopDTO> mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<LaptopDTO> getLaptops() {
        return service.getLaptops().stream()
                .map(mapper::fromEntity)
                .collect(Collectors.toList());
    }


    @GetMapping(
            path = "/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public LaptopDTO getLaptop(@PathVariable @Positive Long id) {
        Laptop laptop = service.getLaptop(id);
        return mapper.fromEntity(laptop);
    }

    @PostMapping(
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseCreatedDTO createLaptop(@Valid @RequestBody LaptopDTO dto) {
        Long id = service.createLaptop(mapper.toEntity(dto));
        return ResponseCreatedDTO.createdBuilder()
                .id(id)
                .build();
    }

    @PostMapping(
            path = "/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseUpdatedDTO updateLaptop(
            @Valid @RequestBody LaptopDTO dto,
            @PathVariable @Positive Long id
    ) {
        service.updateLaptop(id, mapper.toEntity(dto));
        return ResponseUpdatedDTO.updatedBuilder()
                .id(id)
                .build();
    }
}
