package com.feinno.talk.springservicetalk.com.feinno.talk.service.mapper;

import com.feinno.talk.springservicetalk.com.feinno.talk.service.pojo.TalkUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by yushaobo on 18-2-2.
 */
@Mapper
public interface TalkUserMapper {

    /**
      * 根据userID查询用户个人信息
      * @param: userID
      * @return: TalkUser
      */
    @Select("SELECT * FROM TalkUser WHERE userID = #{userID}")
    TalkUser findUserByUserID(@Param("userID") String userID);

    /**
      * 插入一条用户数据
      * @param:
      * @return: int
      */
    @Insert("INSERT INTO TalkUser(userID, passWord, mobileNO) VALUES(#{userID}, #{password}, #{mobileNO})")
    int insert(@Param("userID") String name, @Param("password") String password, @Param("mobileNO") String phone);
}
