package org.yj.maple.web.mapper;

import org.mapstruct.Mapper;
import org.yj.maple.web.domain.users.Users;
import org.yj.maple.web.dto.UsersDto;

@Mapper
public interface UsersMapper {

    Users toUser(UsersDto usersDto);

    UsersDto toDto(Users users);
}
