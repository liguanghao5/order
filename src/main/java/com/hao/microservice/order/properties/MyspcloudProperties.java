package com.hao.microservice.order.properties;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="myspcloud")
public class MyspcloudProperties {


    private ItemProperties item;

    public ItemProperties getItem() {
        return item;
    }

    public void setItem(ItemProperties item) {
        this.item = item;
    }
}
