package org.yj.maple.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.yj.maple.web.dto.CharacterInfosDto;
import org.yj.maple.web.dto.GlobalResponseDto;
import org.yj.maple.web.service.CharacterInfosService;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "${api.path}")
public class CharacterInfoController {

    private final CharacterInfosService characterInfosService;

    @PostMapping("/characters")
    public GlobalResponseDto register(@RequestBody CharacterInfosDto characterInfosDto){

        characterInfosService.register(characterInfosDto);

        return GlobalResponseDto.builder()
                .code("201")
                .status("Created")
                .message("register character-info")
                .build();
    }

    @PutMapping("/characters/{id}")
    public GlobalResponseDto modify(@PathVariable Long id, @RequestBody CharacterInfosDto characterInfosDto){

        return GlobalResponseDto.builder()
                .code("200")
                .status("OK")
                .message("modify character-info")
                .data(characterInfosService.modify(id, characterInfosDto)).build();
    }
}
