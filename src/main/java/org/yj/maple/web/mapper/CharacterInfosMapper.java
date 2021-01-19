package org.yj.maple.web.mapper;

import org.mapstruct.Mapper;
import org.yj.maple.web.domain.characterinfos.CharacterInfos;
import org.yj.maple.web.dto.CharacterInfosDto;

@Mapper
public interface CharacterInfosMapper {

    CharacterInfos toEntity(CharacterInfosDto characterInfosDto);
    CharacterInfosDto toDto(CharacterInfos characterInfos);
}
