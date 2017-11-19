package com.feinno.talk.springservicetalk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private TalkProperties talkProperties;

    @RequestMapping(value = "/hello" ,method = RequestMethod.GET)
    public String say(){
        return "Hello SpringBoot"+talkProperties.getAge()+talkProperties.getCupSize();
    }
}
