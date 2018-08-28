package com.thoughtworks.contract.consumer.service;

import com.thoughtworks.contract.consumer.entity.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author yywei
 **/
@Service
public class ProductService {
    public Product getProduct(String url) {
        RestTemplate restTemplate = new RestTemplate();
        Product product = restTemplate.getForObject(url, Product.class);
        return product;
    }
}
