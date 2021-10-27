package com.example.cleanarchitecture.application.data.character.repository;

import com.example.cleanarchitecture.application.data.singlecharacter.datasource.SingleCharacterDataSource;
import com.example.cleanarchitecture.application.data.singlecharacter.entity.CharacterEntity;
import com.example.cleanarchitecture.application.data.singlelocation.datasource.SingleLocationDataSource;
import com.example.cleanarchitecture.application.data.singlelocation.entity.LocationEntity;
import com.example.cleanarchitecture.application.domain.model.CharacterModel;
import com.example.cleanarchitecture.application.domain.model.LocationModel;
import com.example.cleanarchitecture.application.domain.repository.CharacterRepository;
import com.example.cleanarchitecture.common.Mapper;

public class CharacterRepositoryImpl implements CharacterRepository {

    private SingleCharacterDataSource iSingleCharacterDataSource;
    private SingleLocationDataSource iSingleLocationDataSource;
    private Mapper<CharacterModel, CharacterEntity> characterMapper;
    private Mapper<LocationModel, LocationEntity> locatiionMapper;

    public CharacterRepositoryImpl(SingleCharacterDataSource iSingleCharacterDataSource,
                                   SingleLocationDataSource iSingleLocationDataSource,
                                   Mapper<CharacterModel, CharacterEntity> characterMapper,
                                   Mapper<LocationModel, LocationEntity> locatiionMapper) {
        this.iSingleCharacterDataSource = iSingleCharacterDataSource;
        this.iSingleLocationDataSource = iSingleLocationDataSource;
        this.characterMapper = characterMapper;
        this.locatiionMapper = locatiionMapper;
    }


    @Override
    public CharacterModel getDetails(Integer id) {

        CharacterEntity singleCharacterEntity = iSingleCharacterDataSource.getCharacter(id);
        LocationEntity singleLocationEntity = iSingleLocationDataSource.getLocation(singleCharacterEntity.getOrigin().getUrl());

        CharacterModel characterModel = characterMapper.toModel(singleCharacterEntity);
        characterModel.setLocationModel(locatiionMapper.toModel(singleLocationEntity));

        return characterModel;




    }
}
