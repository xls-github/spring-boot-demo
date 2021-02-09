package com.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author tingren
 * @date 2021/2/5
 */
@Component
@PropertySource(value = {"classpath:property-source.properties"})
@ConfigurationProperties("database")
public class PropertySourceConfig {
    @Value("${fileName}")
    private String fileName;
    private String userName;
    private String passWord;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
