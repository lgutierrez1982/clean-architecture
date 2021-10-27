package com.example.cleanarchitecture.application.data.character.mapper;

import com.example.cleanarchitecture.application.data.singlecharacter.entity.CharacterEntity;
import com.example.cleanarchitecture.application.domain.model.CharacterModel;
import com.example.cleanarchitecture.common.Mapper;

public class CharacterDetailsModelMapper extends Mapper<CharacterModel, CharacterEntity> {

    @Override
    public CharacterEntity toEntity(CharacterModel model) {
        return CharacterEntity.builder()
                .id(model.getId())
                .name(model.getName())
                .status(model.getStatus())
                .species(model.getSpecies())
                .type(model.getType())
                .build();
    }

    @Override
    public CharacterModel toModel(CharacterEntity entity) {
        return CharacterModel.builder()
                .id(entity.getId())
                .name(entity.getName())
                .status(entity.getStatus())
                .species(entity.getSpecies())
                .type(entity.getType())
                .episodeCount(entity.getEpisode().size())
                .build();
    }
}
