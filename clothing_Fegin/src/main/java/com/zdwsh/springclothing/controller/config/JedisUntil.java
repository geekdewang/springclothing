package com.zdwsh.springclothing.controller.config;

import redis.clients.jedis.Jedis;

public class JedisUntil {


    //1、创建对象
   public static Jedis creatJedis(){
       Jedis jedis = new Jedis("39.105.189.141",6379);
       jedis.auth("qfjava");
       return jedis;
   }
}
