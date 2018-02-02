package com.feinno.talk.springservicetalk.com.feinno.talk.service.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

    private static Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping(value = "/hello" ,method = RequestMethod.GET)
    public String hello(){
        LOGGER.info("HelloController start");
        return "index";
    }
}
