package com.example.cleanarchitecture.application.data.singlecharacter.datasource;

import com.example.cleanarchitecture.application.data.singlecharacter.entity.CharacterEntity;

public interface SingleCharacterDataSource {

    CharacterEntity getCharacter(Integer id);
}
