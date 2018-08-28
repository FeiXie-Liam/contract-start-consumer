package com.thoughtworks.contract.consumer.service;

import com.thoughtworks.contract.consumer.entity.Goods;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author yywei
 **/
@Service
public class GoodsService {

    public Goods getGoods(String url) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, Goods.class);
    }
}
