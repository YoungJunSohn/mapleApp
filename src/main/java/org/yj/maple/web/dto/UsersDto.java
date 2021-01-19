package org.yj.maple.web.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.yj.maple.web.domain.users.Users;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsersDto {
    private Long id;
    private String name;
    private String phone;
    private String password;
    private Boolean isAdmin;
    private Boolean isActive;


    @JsonIgnore
    public Users toEntity(UsersDto usersDto){
        return Users.builder()
                .name(usersDto.getName())
                .phone(usersDto.getPhone())
                .password(usersDto.getPassword())
                .isAdmin(usersDto.getIsAdmin())
                .isActive(usersDto.getIsActive()).build();
    }
}
