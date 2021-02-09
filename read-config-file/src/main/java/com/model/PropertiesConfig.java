package com.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author tingren
 * @date 2021/2/5
 */
@Component
public class PropertiesConfig {
    @Value("${fileName}")
    private String fileName;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
