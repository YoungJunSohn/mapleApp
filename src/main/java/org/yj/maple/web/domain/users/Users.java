package org.yj.maple.web.domain.users;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.yj.maple.web.domain.BaseTimeEntity;
import org.yj.maple.web.domain.characterinfos.CharacterInfos;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Users extends BaseTimeEntity {

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
    public void deactivate() {
        this.isActive = false;
    }

    //mappedBy는 해당 연결 테이블에 설정된 멤버필드명으로 연결해야 한다.
    @OneToMany(mappedBy = "users" , cascade = CascadeType.REMOVE)
    private List<CharacterInfos> characterInfosList = new ArrayList<>();

    public void addCharacters(CharacterInfos characterInfos){
        characterInfos.addUser(this);
        this.characterInfosList.add(characterInfos);
    }
}
