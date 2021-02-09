package com.test;

import com.model.PropertySourceConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author tingren
 * @date 2021/2/5
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertySourceConfigTest {

    @Autowired
    private PropertySourceConfig propertySourceConfig;

    @Test
    public void test(){
        assert "configName".equals(propertySourceConfig.getFileName());
        System.out.println("fileName = " + propertySourceConfig.getFileName());
        assert "root".equals(propertySourceConfig.getUserName());
        System.out.println(propertySourceConfig.getUserName());
        assert "root".equals(propertySourceConfig.getPassWord());
        System.out.println(propertySourceConfig.getPassWord());
    }
}
