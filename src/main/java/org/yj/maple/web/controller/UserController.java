package org.yj.maple.web.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.yj.maple.web.dto.GlobalResponseDto;
import org.yj.maple.web.dto.UsersDto;
import org.yj.maple.web.service.UsersService;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping(path = "${api.path}")
public class UserController {

    private final UsersService usersService;

    //유저 등록
    @PostMapping("/users")
    public GlobalResponseDto register(@RequestBody UsersDto usersDto){
        usersService.register(usersDto);
        return GlobalResponseDto.builder()
                .code("201")
                .status("Created")
                .message("register user")
                .build();
    }

    //유저 상세
    @GetMapping("/users/{id}")
    public GlobalResponseDto getOne(@PathVariable Long id){

        return GlobalResponseDto.builder()
                .code("200")
                .status("OK")
                .message("get user detail")
                .data(usersService.getOne(id)).build();
    }

    //유저 삭제(비활성)
    @PutMapping("/users/{id}")
    public GlobalResponseDto deactivate(@PathVariable Long id){
        return GlobalResponseDto.builder()
                .code("200")
                .status("OK")
                .message("deactivate user no."+ id)
                .data(usersService.deactivate(id)).build();
    }
    
}
