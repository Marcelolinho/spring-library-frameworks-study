package com.mpp.study.web.handler;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class ApiResponse {

    private String message;
    private Integer code;
    private LocalDateTime timestamp;
}
