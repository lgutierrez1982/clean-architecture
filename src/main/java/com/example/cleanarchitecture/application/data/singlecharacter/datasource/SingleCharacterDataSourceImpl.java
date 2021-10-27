package com.example.cleanarchitecture.application.data.singlecharacter.datasource;

import com.example.cleanarchitecture.application.data.singlecharacter.entity.CharacterEntity;
import com.example.cleanarchitecture.configuration.CharacterProperties;
import org.springframework.web.client.RestTemplate;

public class SingleCharacterDataSourceImpl implements SingleCharacterDataSource {

    private RestTemplate restTemplate;
    private CharacterProperties characterProperties;

    public SingleCharacterDataSourceImpl(RestTemplate restTemplate, CharacterProperties characterProperties) {
        this.restTemplate = restTemplate;
        this.characterProperties = characterProperties;
    }

    @Override
    public CharacterEntity getCharacter(Integer id) {
        return restTemplate.getForObject(characterProperties.getCharacterURL(id), CharacterEntity.class);
    }
}
