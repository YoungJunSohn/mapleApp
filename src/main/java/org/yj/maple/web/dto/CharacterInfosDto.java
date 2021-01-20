package org.yj.maple.web.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.yj.maple.web.domain.abilities.Abilities;
import org.yj.maple.web.domain.hyperstats.HyperStats;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class CharacterInfosDto {
    private Long id;
    private String name;
    private String className;
    private HyperStats hyperStats;
    private Abilities abilities;
}
