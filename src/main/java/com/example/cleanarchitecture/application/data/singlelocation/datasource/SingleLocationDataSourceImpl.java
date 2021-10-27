package com.example.cleanarchitecture.application.data.singlelocation.datasource;

import com.example.cleanarchitecture.application.data.singlelocation.entity.LocationEntity;
import org.springframework.web.client.RestTemplate;

public class SingleLocationDataSourceImpl implements SingleLocationDataSource {

    private RestTemplate restTemplate;

    public SingleLocationDataSourceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public LocationEntity getLocation(String url) {
        return restTemplate.getForObject(url, LocationEntity.class);
    }
}
