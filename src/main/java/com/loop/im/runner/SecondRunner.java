package com.loop.im.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

/**
 * Created by admin on 2016/12/1.
 */
@Component
public class SecondRunner implements ApplicationRunner, Ordered {

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        System.out.println("I am the second runner of this App");
    }

    @Override
    public int getOrder() {
        return 2;
    }
}
