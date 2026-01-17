package com.mpp.study.web.controller.characterETL;

import com.mpp.study.mongodb.model.CharacterModel;
import com.mpp.study.web.params.characterETL.CharacterModelAttr;
import com.mpp.study.web.services.CharacterSearchServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("api/character")
public class CharacterModelController {

    private CharacterSearchServiceImpl characterSearchService;

    public CharacterModelController(CharacterSearchServiceImpl characterSearchService) {
        this.characterSearchService = characterSearchService;
    }

    @GetMapping("/{name}")
    public CharacterModel find(@PathVariable String name) {
        return characterSearchService.searchCharacterByName(name);
    }
}
