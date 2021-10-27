package com.example.cleanarchitecture.application.data.character.mapper;

import com.example.cleanarchitecture.application.data.singlelocation.entity.LocationEntity;
import com.example.cleanarchitecture.application.domain.model.LocationModel;
import com.example.cleanarchitecture.common.Mapper;

public class LocationDetailsModelMapper extends Mapper<LocationModel, LocationEntity> {

    @Override
    public LocationEntity toEntity(LocationModel value) {
        return LocationEntity.builder()
                .name(value.getName())
                .build();
    }

    @Override
    public LocationModel toModel(LocationEntity value) {
        return LocationModel.builder()
                .name(value.getName())
                .url(value.getUrl())
                .dimension(value.getDimension())
                .residents(value.getResidents())
                .build();
    }
}
