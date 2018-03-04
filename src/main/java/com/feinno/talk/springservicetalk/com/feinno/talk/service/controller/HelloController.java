package com.feinno.talk.springservicetalk.com.feinno.talk.service.controller;

import com.feinno.talk.springservicetalk.com.feinno.talk.service.pojo.TalkUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    private static Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping(value = "/hello" ,method = RequestMethod.GET)
    public ModelAndView hello(){
        LOGGER.info("HelloController start");
        TalkUser talkUser = new TalkUser();
        return new ModelAndView("adapter").addObject(talkUser);
    }

    @RequestMapping(value = "/login" ,method = RequestMethod.POST)
    public String dealLogin(@ModelAttribute TalkUser talkUser){
        System.out.println("=================");
        System.out.println(talkUser.getUserID());
        return "index";
    }
}
