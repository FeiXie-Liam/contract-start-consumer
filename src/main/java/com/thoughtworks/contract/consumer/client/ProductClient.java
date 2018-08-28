package com.thoughtworks.contract.consumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author yywei
 **/
@FeignClient("http://localhost:8998/products")
public interface ProductClient {

    @GetMapping
    public ResponseEntity getAll();
}
