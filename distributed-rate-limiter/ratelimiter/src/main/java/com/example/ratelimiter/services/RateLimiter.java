package com.example.ratelimiter.services;

import com.example.ratelimiter.RateLimitPolicyStore;

public abstract class RateLimiter {

    private final RateLimitPolicyStore rateLimitPolicyStore;

    public RateLimiter(RateLimitPolicyStore rateLimitPolicyStore){
        this.rateLimitPolicyStore = rateLimitPolicyStore;
    }
    

    public boolean isAllowed(){
        
    }
}
