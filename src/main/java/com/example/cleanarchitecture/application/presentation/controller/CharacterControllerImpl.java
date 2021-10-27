package com.example.cleanarchitecture.application.presentation.controller;

import com.example.cleanarchitecture.application.domain.usecase.CharacterDetailsUseCase;
import com.example.cleanarchitecture.application.presentation.body.DetailsBody;
import org.springframework.http.ResponseEntity;

public class CharacterControllerImpl implements CharacterController {

    private final CharacterDetailsUseCase characterDetailsUseCase;

    public CharacterControllerImpl(CharacterDetailsUseCase characterDetailsUseCase) {
        this.characterDetailsUseCase = characterDetailsUseCase;
    }

    @Override
    public ResponseEntity<?> getDetails(DetailsBody detailsBody) {
        return ResponseEntity.ok(characterDetailsUseCase.getDetails(detailsBody.id));
    }
}
