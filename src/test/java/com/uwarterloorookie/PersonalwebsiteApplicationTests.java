package com.uwarterloorookie;

import com.uwarterloorookie.bean.User;
import com.uwarterloorookie.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PersonalwebsiteApplicationTests {
    @Autowired
   private UserMapper userMapper;
    @Test
    void userRegistertest() {
      userMapper.rigisterUser("122222","aaaa");
       User user1 = userMapper.getUser("122222","aaaa");
       System.out.println(user1);
       user1.toString();



    }

}
