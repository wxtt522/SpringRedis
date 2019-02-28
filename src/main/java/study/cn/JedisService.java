//package study.cn;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import redis.clients.jedis.Jedis;
//import redis.clients.jedis.JedisPool;
//
//@Service
//public class JedisService {
//    @Autowired
//    JedisPool jedisPool;
//
//    private Jedis jedis;
//
//    public String get(String key) {
//        jedis = jedisPool.getResource();
//        String value = jedis.get(key);
//        jedis.close();
//        return value;
//    }
//
//    public void set(String key, String value) {
//        jedis = jedisPool.getResource();
//        jedis.set(key, value);
//        jedis.close();
//    }
//
//
//}
