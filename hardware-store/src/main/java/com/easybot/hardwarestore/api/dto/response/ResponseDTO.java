package com.easybot.hardwarestore.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTO {
    public static String CREATED = "CREATED";
    public static String UPDATED = "UPDATED";

    private String message;
}
