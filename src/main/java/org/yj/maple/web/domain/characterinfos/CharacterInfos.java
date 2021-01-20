package org.yj.maple.web.domain.characterinfos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.yj.maple.web.domain.BaseTimeEntity;
import org.yj.maple.web.domain.users.Users;

import javax.persistence.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CharacterInfos extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String className;

    @ManyToOne(fetch = FetchType.LAZY)
    private Users users;

    public void addUser(Users users){
        this.users.addCharacters(this);
    }

    /*@OneToOne(mappedBy = "CharacterInfos", fetch = FetchType.LAZY)
    private HyperStats hyperStats;*/
}
