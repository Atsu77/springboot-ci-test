package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void test1() {
        Assert.isTrue(1 + 1 == 2, "1 + 1 should equal 2");
    }
}
