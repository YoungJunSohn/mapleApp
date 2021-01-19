package org.yj.maple.web.service;

import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.yj.maple.web.domain.characterinfos.CharacterInfos;
import org.yj.maple.web.domain.characterinfos.CharacterInfosRepository;
import org.yj.maple.web.dto.CharacterInfosDto;
import org.yj.maple.web.mapper.CharacterInfosMapper;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class CharacterInfosService {

    private final CharacterInfosRepository characterInfosRepository;
    private CharacterInfosMapper characterInfosMapper;

    @PostConstruct
    public void init(){
        CharacterInfosMapper instance = Mappers.getMapper(CharacterInfosMapper.class);
    }

    public void register(CharacterInfosDto characterInfosDto){
        characterInfosRepository.save(characterInfosMapper.toEntity(characterInfosDto));
    }

    @Transactional
    public CharacterInfosDto modify(Long id, CharacterInfosDto characterInfosDto) {
        CharacterInfos beforeData = characterInfosRepository.getOne(id);
        CharacterInfos modifiedData = characterInfosMapper.toEntity(characterInfosDto);
        beforeData = modifiedData;

        return characterInfosMapper.toDto(beforeData);
    }
}
