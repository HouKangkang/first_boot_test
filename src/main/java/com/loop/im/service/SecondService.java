package com.loop.im.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

/**
 * Created by admin on 2016/11/30.
 */
@Service
//@ConfigurationProperties(prefix =yService")
public class SecondService {

    @NotNull
    @Value("${name}")
    private String name;

    private int age;

    public String getName() {
        return String.format("I am %s, age: %d", name, age);
    }
}
