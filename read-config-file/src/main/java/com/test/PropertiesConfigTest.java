package com.test;

import com.model.PropertiesConfig;
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
public class PropertiesConfigTest {
    @Autowired
    private PropertiesConfig propertiesConfig;
    @Test
    public void test(){
        System.out.println(propertiesConfig.getFileName());
        assert "configName".equals(propertiesConfig.getFileName());
    }
}
