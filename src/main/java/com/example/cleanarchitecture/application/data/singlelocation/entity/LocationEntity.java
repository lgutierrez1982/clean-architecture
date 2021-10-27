package com.example.cleanarchitecture.application.data.singlelocation.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Getter @Setter
@ToString
public class LocationEntity {

    @JsonProperty
    private Integer id;
    @JsonProperty
    private String name;
    @JsonProperty
    private String type;
    @JsonProperty
    private String dimension;
    @JsonProperty
    private List<String> residents;
    @JsonProperty
    private String url;


}
