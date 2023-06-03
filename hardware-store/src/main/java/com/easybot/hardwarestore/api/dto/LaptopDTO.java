package com.easybot.hardwarestore.api.dto;

import com.easybot.hardwarestore.api.mapper.marker.DtoMarker;
import com.easybot.hardwarestore.model.LaptopSize;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LaptopDTO implements DtoMarker {
    @NotBlank
    String name;
    @NotBlank
    String serialNum;
    @NotBlank
    String manufacturer;
    @PositiveOrZero
    BigDecimal price;
    @PositiveOrZero
    int count;
    private Long publicId;
    @NotNull
    private LaptopSize size;
}
