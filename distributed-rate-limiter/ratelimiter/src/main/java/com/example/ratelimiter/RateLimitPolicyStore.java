package com.example.ratelimiter;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.ConstructorBinding;

import com.example.ratelimiter.model.RateLimiterPolicy;

@ConfigurationProperties(prefix = "policies")
public class RateLimitPolicyStore {
    
    private final Map<String, RateLimiterPolicy> policies;

    @ConstructorBinding
    public RateLimitPolicyStore(List<RateLimiterPolicy> policies){
        this.policies = policies.stream().collect(Collectors.toMap(RateLimiterPolicy::getKey, (policy) -> policy));
    }

    public Optional<RateLimiterPolicy> getPolicy(String key){
        return Optional.ofNullable(policies.get(key));
    }
}
