package com.orange.springeurekaclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

/**
 * Created by Karim on 8/1/2017.
 */
@RestController
public class SpringEurekaRestController {

    @Value("${words}") String words;

    @Autowired
    DiscoveryClient client;

    @RequestMapping("/")
    public String getWord() {
        return words;
    }
    @RequestMapping("/getAllClientsWords")
    public  String getAllClientsWords() {
        return String.format("%s %s %s.",
                getWord("spring-eureka-clinet1"),
                getWord("spring-eureka-clinet2"),
                getWord("spring-eureka-clinet3"));
    }

    public String getWord(String service){
        List<ServiceInstance> list = client.getInstances(service);
        if (list != null && list.size() > 0 ) {
            URI uri = list.get(0).getUri();
            if (uri !=null ) {
                return (new RestTemplate()).getForObject(uri,String.class);
            }
        }
        return null;
    }

}
