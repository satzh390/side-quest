package com.example.ratelimiter.model;

import lombok.Data;

@Data 
public class RateLimiterPolicy {
    public String key;
    public FailMode failMode;
    public int limit;
    public TimeUnit timeUnit;
}
