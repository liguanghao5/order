package com.hao.microservice.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
@EnableFeignClients(basePackages ="com.hao.microservice.order.feign")
public class OrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class, args);
	}




    /**
     * 向Spring容器中定义RestTemplate对象
     * @return
     */
	@Bean
    @LoadBalanced
    public RestTemplate restTemplate(){

        RestTemplate restTemplate = new RestTemplate(new OkHttp3ClientHttpRequestFactory());

        return restTemplate;
    }




}
