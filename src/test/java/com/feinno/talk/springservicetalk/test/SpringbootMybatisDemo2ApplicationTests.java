package com.feinno.talk.springservicetalk.test;

import com.feinno.talk.springservicetalk.com.feinno.talk.service.mapper.TalkUserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by yushaobo on 18-2-2.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisDemo2ApplicationTests {

    @Autowired
    private TalkUserMapper talkUserMapper;

    @Test
    public void test(){
        talkUserMapper.insert("winterchen", "123456", "12345678910");
    }
}
