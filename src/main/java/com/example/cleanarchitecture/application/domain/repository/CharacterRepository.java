package com.example.cleanarchitecture.application.domain.repository;

import com.example.cleanarchitecture.application.domain.model.CharacterModel;

public interface CharacterRepository {

    CharacterModel getDetails(Integer id);
}
