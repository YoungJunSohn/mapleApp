package org.yj.maple.web.service;

import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;
import org.yj.maple.web.domain.User;
import org.yj.maple.web.domain.UsersRepository;
import org.yj.maple.web.dto.UserDto;
import org.yj.maple.web.mapper.UserMapper;

import javax.annotation.PostConstruct;

@Service
public class UsersService {

    private UsersRepository usersRepository;
    private UserMapper userMapper;

    //단 한번만 초기화할 것
    @PostConstruct
    public void init(){
        UserMapper instance = Mappers.getMapper(UserMapper.class);
    }


    public void register(UserDto userDto){

        User user = userMapper.toUser(userDto);

        usersRepository.save(user);
    }
}
