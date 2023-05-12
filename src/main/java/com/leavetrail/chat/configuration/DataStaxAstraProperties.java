package com.leavetrail.chat.configuration;

import java.io.File;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Configuration;
import com.datastax.oss.driver.api.core.CqlSession;



@ConfigurationProperties(prefix = "datastax.astra")
public class DataStaxAstraProperties {
    private File secureConnectBundle;

    public File getSecureConnectBundle() {
        return secureConnectBundle;
    }

    public void setSecureConnectBundle(File secureConnectBundle) {
        this.secureConnectBundle = secureConnectBundle;
    }
}
