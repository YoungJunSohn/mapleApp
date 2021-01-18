package org.yj.maple.web.mapper;

import org.mapstruct.Mapper;
import org.yj.maple.web.domain.User;
import org.yj.maple.web.dto.UserDto;

@Mapper
public interface UserMapper {

    User toUser(UserDto userDto);
    User toDto(User user);
}
