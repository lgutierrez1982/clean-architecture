package com.example.cleanarchitecture.application.domain.usecase;

import com.example.cleanarchitecture.application.domain.model.CharacterModel;
import com.example.cleanarchitecture.application.domain.repository.CharacterRepository;

public class CharacterDetailsUseCase {

    private CharacterRepository iCharacterRepository;

    public CharacterDetailsUseCase(CharacterRepository iCharacterRepository) {
        this.iCharacterRepository = iCharacterRepository;
    }

    public CharacterModel getDetails(Integer id){
        return iCharacterRepository.getDetails(id);

    }

}
