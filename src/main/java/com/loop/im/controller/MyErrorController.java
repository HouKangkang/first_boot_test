package com.loop.im.controller;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Component;

/**
 * Created by admin on 2016/12/1.
 */
@Component
public class MyErrorController implements ErrorController {
    
    @Override
    public String getErrorPath() {
        return "/my_error";
    }
    
}
