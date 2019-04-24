package com.jiuyue.conproperties.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Create bySeptember
 * 2019/4/23
 * 22:13
 */
@Component
//@Configuration
@ConfigurationProperties(prefix = "user")
public class User {
    private String nickname;
    private String email;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
