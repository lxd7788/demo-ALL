package com.lxd.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName Es_config
 * @Author lxd
 * @Date 2021/1/13 21:57
 * @Description TODO
 */
@Configuration
public class Es_config {

    @Bean
    public RestHighLevelClient esClient(){
        RestHighLevelClient client = new RestHighLevelClient(
                RestClient.builder(
                        new HttpHost("39.107.204.172", 9200, "http")));
        return client;
    }


}
