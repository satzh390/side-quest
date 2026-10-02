package com.example.ratelimiter.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ratelimiter.dto.CheckQuotaRequest;
import com.example.ratelimiter.dto.CheckQuotaResponse;

@RestController("/quota")
public class RatelimiterController {

    @PostMapping("/check")
    public ResponseEntity<CheckQuotaResponse> check(@RequestBody CheckQuotaRequest request){

    }
    
}
