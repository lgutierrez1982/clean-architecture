package com.example.cleanarchitecture.application.presentation.body;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotNull;

public class DetailsBody {
    @JsonProperty
    @NotNull
    public Integer id;
}
