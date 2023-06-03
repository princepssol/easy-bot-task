package com.easybot.hardwarestore.api.mapper;

import com.easybot.hardwarestore.api.dto.LaptopDTO;
import com.easybot.hardwarestore.model.Laptop;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public abstract class LaptopMapper implements EntityMapper<Laptop, LaptopDTO> {
}
