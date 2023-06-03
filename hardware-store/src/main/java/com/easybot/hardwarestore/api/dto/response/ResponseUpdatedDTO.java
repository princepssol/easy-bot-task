package com.easybot.hardwarestore.api.dto.response;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class ResponseUpdatedDTO extends ResponseDTO{
    private long id;

    @Builder(builderMethodName = "updatedBuilder")
    public ResponseUpdatedDTO(long id) {
        super(ResponseDTO.UPDATED);
        this.id = id;
    }
}
