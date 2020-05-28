package com.sh.redis.service;

import com.sh.redis.entity.Address;
import com.sh.redis.entity.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

/**
 * Created By Sunhu At 2020/5/26 15:23
 *
 * @author Sun
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRedisTemplate {

    @Autowired
    RedisTemplate redisTemplate;

    @Test
    public void testValue() {

        Person person = new Person("boke","byrant");
        person.setAddress(new Address("南京","中国"));
        //person.setAddress(new Address("南京","中国"));
        //ValueOperations<String,Object> operations = redisTemplate.opsForValue();
        ValueOperations valueOperations = redisTemplate.opsForValue();
        valueOperations.set("player:1",person,20, TimeUnit.SECONDS); //10秒之后数据消失

        Object o = valueOperations.get("player:1");
        System.out.println(o);
    }


}
