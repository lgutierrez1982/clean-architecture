package com.example.cleanarchitecture.configuration;

import org.springframework.beans.factory.annotation.Value;

public class CharacterProperties {

    @Value("${challenge_api.base_url}")
    private String baseURL;

    @Value("${challenge_api.endpoints.character}")
    private String characterEndPoint;

    public String getCharacterURL(Integer character) {
        return baseURL.concat(characterEndPoint).replace("{character_id}", character.toString());
    }

}
