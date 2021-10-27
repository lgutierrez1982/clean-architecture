package com.example.cleanarchitecture.configuration;

import com.example.cleanarchitecture.application.data.character.mapper.CharacterDetailsModelMapper;
import com.example.cleanarchitecture.application.data.character.mapper.LocationDetailsModelMapper;
import com.example.cleanarchitecture.application.data.character.repository.CharacterRepositoryImpl;
import com.example.cleanarchitecture.application.data.singlecharacter.datasource.SingleCharacterDataSource;
import com.example.cleanarchitecture.application.data.singlecharacter.datasource.SingleCharacterDataSourceImpl;
import com.example.cleanarchitecture.application.data.singlecharacter.entity.CharacterEntity;
import com.example.cleanarchitecture.application.data.singlelocation.datasource.SingleLocationDataSource;
import com.example.cleanarchitecture.application.data.singlelocation.datasource.SingleLocationDataSourceImpl;
import com.example.cleanarchitecture.application.data.singlelocation.entity.LocationEntity;
import com.example.cleanarchitecture.application.domain.model.CharacterModel;
import com.example.cleanarchitecture.application.domain.model.LocationModel;
import com.example.cleanarchitecture.application.domain.repository.CharacterRepository;
import com.example.cleanarchitecture.application.domain.usecase.CharacterDetailsUseCase;
import com.example.cleanarchitecture.application.presentation.controller.CharacterControllerImpl;
import com.example.cleanarchitecture.application.presentation.controller.CharacterController;
import com.example.cleanarchitecture.common.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class CharacterConfiguration {

    //Presentation
    @Bean
    CharacterController characterController(CharacterDetailsUseCase characterDetailsUseCase){
        return new CharacterControllerImpl(characterDetailsUseCase);
    }


    //Domain
    @Bean
    CharacterDetailsUseCase characterDetailsUseCase(CharacterRepository iCharacterRepository){
        return new CharacterDetailsUseCase(iCharacterRepository);
    }

    @Bean
    CharacterRepository iCharacterRepository(SingleCharacterDataSource iSingleCharacterDataSource,
                                             SingleLocationDataSource iSingleLocationDataSource,
                                             Mapper<CharacterModel, CharacterEntity> characterMapper,
                                             Mapper<LocationModel, LocationEntity> locationMapper){

        return new CharacterRepositoryImpl(iSingleCharacterDataSource,
                                            iSingleLocationDataSource,
                                            characterMapper,
                                            locationMapper);
    }


    //Data
    @Bean
    SingleCharacterDataSource iSingleCharacterDataSource(RestTemplate restTemplate, CharacterProperties characterProperties){
        return new SingleCharacterDataSourceImpl(restTemplate, characterProperties);
    }

    @Bean
    SingleLocationDataSource iSingleLocationDataSource(RestTemplate restTemplate){
        return new SingleLocationDataSourceImpl(restTemplate);
    }

    @Bean
    Mapper<CharacterModel, CharacterEntity> characterMapper(){
        return new CharacterDetailsModelMapper();
    }

    @Bean
    Mapper<LocationModel, LocationEntity> locationMapper(){
        return new LocationDetailsModelMapper();
    }

    @Bean
    CharacterProperties characterProperties() {
        return new CharacterProperties();
    }


    //Framework
    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
