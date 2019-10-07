package com.org.ssm.Service;

import com.org.ssm.Mapper.userMapper;
import com.org.ssm.Pojo.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class userServiceImp implements userService{
@Autowired
    userMapper userMapper;
    @Override
    public user findUserById(int uId) {
        return userMapper.findUserById(uId);
    }
}
