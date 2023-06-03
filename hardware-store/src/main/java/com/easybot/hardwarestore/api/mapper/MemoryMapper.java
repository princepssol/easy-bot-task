package com.easybot.hardwarestore.api.mapper;

import com.easybot.hardwarestore.api.dto.MemoryDTO;
import com.easybot.hardwarestore.model.Mem;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public abstract class MemoryMapper implements EntityMapper<Mem, MemoryDTO>{
}
