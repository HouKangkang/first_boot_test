package com.loop.im.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by admin on 2016/12/1.
 */
@Component
@Order(3)
public class FirstRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        System.out.println("I am the first runner of this App");
    }

}
