package com.pangpang;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by leewake on 2017/9/20 0020.
 */

@ConfigurationProperties(prefix = "hello")
public class HelloProperties {

    private static String MSG = "world";

    private String msg = MSG;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
