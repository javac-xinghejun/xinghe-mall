package com.xinghe.mall.user.controller.test;

import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.pojo.Instance;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 描述
 *
 * @author 星河君❀❀ 2022/5/9 20:10
 * @see [相关类/方法]
 * @since [版本号]
 */
@SpringBootTest
class TestNacosControllerTest {
    @Resource
    private TestNacosController controller;

    @Test
    void get() {
        boolean b = controller.get();
        System.out.println(b);
    }

    @Test
    void testGet() throws NacosException {
        List<Instance> user = controller.get("user");
        System.out.println(user);
    }
}