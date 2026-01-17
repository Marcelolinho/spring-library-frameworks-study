package com.mpp.study.mongodb.repositories;

import com.mpp.study.mongodb.model.CharacterModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface CharacterRepository extends MongoRepository<CharacterModel, String> {

    @Query(sort = "{}")
    public List<CharacterModel> findByName(String name);
    public CharacterModel findByNameAndShow(String name, String show);
}
