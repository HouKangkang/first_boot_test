package com.loop.im;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by admin on 2016/11/30.
 */
//@RestController
//@EnableAutoConfiguration
//@ComponentScan
//@Configuration
@SpringBootApplication
public class FirstController {


    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(FirstController.class);
        app.setBannerMode(Banner.Mode.OFF);

//        app.setAddCommandLineProperties(false);
//        app.setWebEnvironment(false);
        app.run(args);
    }

}
