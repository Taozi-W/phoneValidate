package com.atguigu.test;

import redis.clients.jedis.Jedis;

import java.util.Set;

public class MyJedisTest {
    public static void main(String[] args) {
        Jedis jedis=new Jedis("192.168.190.128",6379);
        String ping = jedis.ping();
        System.out.println("ping = " + ping);
      /*  jedis.set("k1","v1");
        String k1 = jedis.get("k2");
        System.out.println("k1 = " + k1);
*/
      /*  Set<String> keys = jedis.keys("*");
        for (String key:keys) {
            if(jedis.type(key).equals("string")){
                String s = jedis.get(key);
                System.out.println("字符串" + s);
            }
            if(jedis.type(key).equals("set")){
                Set<String> smembers = jedis.smembers(key);
                System.out.println("set" + smembers);
            }
        }
*/
    }

}
