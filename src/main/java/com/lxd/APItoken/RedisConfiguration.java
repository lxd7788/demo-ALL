package com.lxd.APItoken;

/**
 * @ClassName RedisConfiguration
 * @Author lxd
 * @Date 2020/6/27 12:47
 * @Description TODO
 */
//@Configuration
public class RedisConfiguration {
////    @Bean
//    public JedisConnectionFactory jedisConnectionFactory(){
//        return new JedisConnectionFactory();
//    }
//
//    /**
//     * 支持存储对象
//     * @return
//     */
////    @Bean
//    public RedisTemplate<String, String> redisTemplate(){
//        RedisTemplate<String, String> redisTemplate = new StringRedisTemplate();
//        redisTemplate.setConnectionFactory(jedisConnectionFactory());
//        Jackson2JsonRedisSerializer jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer(Object.class);
//        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
//        objectMapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
//
//        jackson2JsonRedisSerializer.setObjectMapper(objectMapper);
//        redisTemplate.setValueSerializer(jackson2JsonRedisSerializer);
//        redisTemplate.afterPropertiesSet();
//
//        return redisTemplate;
//    }
}
