package org.yj.maple.web.dto;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private long id;
    private String name;
    private String phone;
    private String password;
    private boolean admin;
    private boolean active;
}
