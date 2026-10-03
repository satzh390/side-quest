package com.example.ratelimiter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.script.DefaultRedisScript;
import org.springframework.data.redis.core.script.RedisScript;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class RedisScriptConfig {

    @Bean
    public RedisConnectionFactory redisConnectionFactory() {
        return new LettuceConnectionFactory();
    }

    @Bean
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory redisConnectionFactory) {
        RedisTemplate<String, Object> template = new RedisTemplate<>();
        template.setConnectionFactory(redisConnectionFactory);
        template.setKeySerializer(new StringRedisSerializer());
        template.setValueSerializer(new StringRedisSerializer());
        template.setHashKeySerializer(new StringRedisSerializer());
        template.setHashValueSerializer(new StringRedisSerializer());
        return template;
    }

    @Bean
    public RedisScript<Object> tokenBucketScript() {
        DefaultRedisScript<Object> script = new DefaultRedisScript<>();
        script.setLocation(
            new ClassPathResource("scripts/token_bucket.lua")
        );
        script.setResultType(Object.class);
        return script;
    }

    @Bean
    public RedisScript<Object> fixedWindowScript() {
        DefaultRedisScript<Object> script = new DefaultRedisScript<>();
        script.setLocation(
            new ClassPathResource("scripts/fixed_window.lua")
        );
        script.setResultType(Object.class);
        return script;
    }
}