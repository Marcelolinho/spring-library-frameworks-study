package com.mpp.study.web.controller.characterETL;

import com.mpp.study.mongodb.model.CharacterModel;
import com.mpp.study.web.services.CharacterService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/character")
public class CharacterModelController {

    private final CharacterService characterService;

    public CharacterModelController(CharacterService characterService) {
        this.characterService = characterService;
    }

    @GetMapping("/{name}")
    public CharacterModel find(@PathVariable String name) {
        return characterService.searchCharacterByName(name);
    }
}
