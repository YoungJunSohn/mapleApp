package org.yj.maple.web.domain.users;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true, length = 50)//legnth 를 지정하지 않는 경우, default length = 255 이며, UK 설정이 불가능함
    private String phone;

    private String password;

    private Boolean isAdmin;

    private Boolean isActive;

    @JsonIgnore
    public void deactivate(){
        this.isActive = false;
    }
}
