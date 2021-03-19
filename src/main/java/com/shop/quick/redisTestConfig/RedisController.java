package com.shop.quick.redisTestConfig;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis")
public class RedisController {
    private final RedisTemplate<String, String> redisTemplate;

    public RedisController(RedisTemplate<String, String> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

//    @ApiOperation(value="redis key 등록")
    @PostMapping("")
    public ResponseEntity<?> addRedisKey(
            // @ApiParam(value="key", defaultValue="")
                                         @RequestParam String key,
               //                          @ApiParam(value="value", defaultValue="")
                                         @RequestParam String value){
        key = "196732";
        value = "196732";
        ValueOperations<String, String> vop = redisTemplate.opsForValue();
        vop.set(key,value);
        return null;
    }

}
