package com.easybot.hardwarestore.api.mapper;

import com.easybot.hardwarestore.api.dto.ComputerDTO;
import com.easybot.hardwarestore.model.Computer;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public abstract class ComputerMapper implements EntityMapper<Computer, ComputerDTO> {
}
