package com.example.cleanarchitecture.application.data.singlelocation.datasource;

import com.example.cleanarchitecture.application.data.singlelocation.entity.LocationEntity;

public interface SingleLocationDataSource {

    LocationEntity getLocation(String url);
}
