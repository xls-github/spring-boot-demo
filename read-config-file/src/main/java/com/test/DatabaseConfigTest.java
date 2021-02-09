package com.test;

import com.model.DatabaseConfig;
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
public class DatabaseConfigTest {
    @Autowired
    private DatabaseConfig databaseConfig;
    @Test
    public void test(){
        System.out.println("username = " + databaseConfig.getUserName() +", password = "+databaseConfig.getPassWord());
        assert "root".equals(databaseConfig.getUserName());
        assert "root".equals(databaseConfig.getPassWord());
    }
}
