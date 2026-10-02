package com.example.ratelimiter.dto;

import lombok.Data;

@Data 
public class CheckQuotaResponse {
    private boolean isAllowed;
}
