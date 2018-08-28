package com.thoughtworks.contract.consumer;

import com.thoughtworks.contract.consumer.entity.Goods;
import com.thoughtworks.contract.consumer.entity.Product;
import com.thoughtworks.contract.consumer.service.GoodsService;
import com.thoughtworks.contract.consumer.service.ProductService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author yywei
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ConsumerApplication.class)
//@AutoConfigureStubRunner(ids = "com.contract.test:provider:+:stubs:9999"
//        , repositoryRoot = "http://ec2-54-222-235-15.cn-north-1.compute.amazonaws.com.cn:8081/repository/maven-snapshots/")
@AutoConfigureStubRunner
public class ConsumerTest {

    @Autowired
    ProductService productService;
    @Autowired
    GoodsService goodsService;

    @Test
    public void test_get_product() {
//        Product product = productService.getProduct("http://localhost:9999/product/1");
//
//        Assert.assertEquals("","");
    }

    @Test
    public void test_get_goods(){
//        Goods goods = goodsService.getGoods("http://localhost:9999/goods/1");
//        Assert.assertEquals("","");
    }
}
