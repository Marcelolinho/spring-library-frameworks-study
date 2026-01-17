package com.mpp.study.web.services;

import com.mpp.study.mongodb.model.CharacterModel;

public interface CharacterService {

    CharacterModel searchCharacterByName(String name);
}
