package org.yj.maple.web.service;

import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;
import org.yj.maple.web.domain.users.Users;
import org.yj.maple.web.domain.users.UsersRepository;
import org.yj.maple.web.dto.UsersDto;
import org.yj.maple.web.mapper.UsersMapper;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class UsersService {

    private final UsersRepository usersRepository;
    private UsersMapper usersMapper;

    //단 한번만 초기화할 것
    @PostConstruct
    public void init(){
        this.usersMapper = Mappers.getMapper(UsersMapper.class);
    }

    @Transactional
    public void register(UsersDto usersDto){
        Users users = usersDto.toEntity(usersDto);
        usersRepository.save(users);
    }

    public UsersDto getOne(Long id){
        Users users = usersRepository.getOne(id);
        return usersMapper.toDto(users);
    }

    @Transactional
    public UsersDto deactivate(Long id){
        Users users = usersRepository.getOne(id);
        users.deactivate();
        UsersDto usersDto = usersMapper.toDto(users);
        return usersDto;
    }
}
