package com.easybot.hardwarestore.api.dto.response;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class ResponseCreatedDTO extends ResponseDTO {
    private long id;

    @Builder(builderMethodName = "createdBuilder")
    public ResponseCreatedDTO(long id) {
        super(ResponseDTO.CREATED);
        this.id = id;
    }
}

