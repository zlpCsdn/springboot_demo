package com.itcodai.course01.dao;

import com.itcodai.course01.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User getUserByName(String username);
    @Select("select * from user where id = #{id}")
    @ResultMap("BaseResultMap")
    User getUser(Long id);

    @Insert("insert into user (user_name, password) values (#{username}, #{password})")
    Integer insertUser(User user);

}
