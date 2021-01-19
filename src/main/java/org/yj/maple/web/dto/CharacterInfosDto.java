package org.yj.maple.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CharacterInfosDto {
    private Long id;
    private String name;
    private String className;
}
