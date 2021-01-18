package org.yj.maple.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.yj.maple.web.dto.UserDto;
import org.yj.maple.web.service.UsersService;

@Slf4j
@RestController
@RequestMapping(path = "${api.path}")
public class UserController {

    private UsersService usersService;

    @PostMapping("/users")
    public void register(@RequestBody UserDto userDto){

        usersService.register(userDto);
    }

}
