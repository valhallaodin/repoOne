package com.aaa.ssm.util;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

import java.util.HashSet;
import java.util.Set;

public class TestRedisClusterConnect {

    public static void main(String[] args) {
        Set<HostAndPort> hps = new HashSet();
        hps.add(new HostAndPort("192.168.57.13",7001));
        hps.add(new HostAndPort("192.168.57.13",7002));
        hps.add(new HostAndPort("192.168.57.13",7003));
        hps.add(new HostAndPort("192.168.57.14",7004));
        hps.add(new HostAndPort("192.168.57.14",7005));
        hps.add(new HostAndPort("192.168.57.14",7006));

        JedisCluster jedisCluster = new JedisCluster(hps);
        jedisCluster.set("eee","555");
        String eee = jedisCluster.get("eee");
        System.out.println(eee);


    }
}
