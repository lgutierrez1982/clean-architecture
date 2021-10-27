package com.example.cleanarchitecture.application.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Getter @Setter
@ToString
public class CharacterModel {

    private Integer id;
    private String name;
    private String status;
    private String species;
    private String type;
    private Integer episodeCount;
    @JsonProperty("origin")
    private LocationModel locationModel;

}
