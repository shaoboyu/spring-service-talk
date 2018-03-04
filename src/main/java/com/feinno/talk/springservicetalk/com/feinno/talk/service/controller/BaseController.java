package com.feinno.talk.springservicetalk.com.feinno.talk.service.controller;

import com.feinno.talk.springservicetalk.com.feinno.talk.service.pojo.TalkUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author yushaobo
 * @create 2018-03-04 15:18
 **/

@Controller
@RequestMapping("/")
public class BaseController {

    private static Logger LOGGER = LoggerFactory.getLogger(BaseController.class);

    /**
    * 首页展示
    *@param:
    *@return: ModelAndView
    */
    @RequestMapping(value = "index" ,method = RequestMethod.GET)
    public ModelAndView hello(){
        LOGGER.info("index start");
        TalkUser talkUser = new TalkUser();
        return new ModelAndView("adapter").addObject(talkUser);
    }

    @RequestMapping(value = "login" ,method = RequestMethod.POST)
    public String dealLogin(@ModelAttribute TalkUser talkUser){
        System.out.println("=================");
        System.out.println(talkUser.getUserID());
        return "index";
    }

    @RequestMapping(value = "/admin",method = RequestMethod.GET)
    public String admin(){
        LOGGER.info("admin start");
        return "admin";
    }

}
