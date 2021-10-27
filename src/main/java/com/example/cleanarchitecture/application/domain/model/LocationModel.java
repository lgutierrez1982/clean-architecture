package com.example.cleanarchitecture.application.domain.model;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Getter
@Setter
@ToString
public class LocationModel {

    private String name;
    private String url;
    private String dimension;
    private List<String> residents;


}
