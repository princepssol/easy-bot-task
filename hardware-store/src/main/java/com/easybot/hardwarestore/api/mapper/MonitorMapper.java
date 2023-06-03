package com.easybot.hardwarestore.api.mapper;

import com.easybot.hardwarestore.api.dto.MonitorDTO;
import com.easybot.hardwarestore.model.Monitor;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public abstract class MonitorMapper implements EntityMapper<Monitor, MonitorDTO> {
}
