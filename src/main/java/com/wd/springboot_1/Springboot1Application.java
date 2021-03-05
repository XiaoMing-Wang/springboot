package com.wd.springboot_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import redis.clients.jedis.Jedis;

@SpringBootApplication
public class Springboot1Application {

    public static void main(String[] args) {

        //Jedis使用
        Jedis jedis = new Jedis("localhost");
        jedis.set("aa", "123456");
        String object = jedis.get("aa");
        System.out.println(object);





        SpringApplication.run(Springboot1Application.class, args);
    }

}
