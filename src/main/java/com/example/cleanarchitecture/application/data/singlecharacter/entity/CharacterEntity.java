package com.example.cleanarchitecture.application.data.singlecharacter.entity;

import com.example.cleanarchitecture.application.data.singlelocation.entity.LocationEntity;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Getter @Setter
@ToString
public class CharacterEntity {

    @JsonProperty
    private Integer id;
    @JsonProperty
    private String name;
    @JsonProperty
    private String status;
    @JsonProperty
    private String species;
    @JsonProperty
    private String type;
    @JsonProperty
    private List<String> episode;
    @JsonProperty
    private LocationEntity origin;




}
