package com.example.cleanarchitecture.common;

import java.util.ArrayList;
import java.util.List;

public abstract class Mapper<T1, T2> {

    public abstract T2 toEntity(T1 value);

    public abstract T1 toModel(T2 value);

    public List<T2> toEntity(List<T1> values) {
        List<T2> returnValues = new ArrayList<>(values.size());
        for (T1 value: values) {
            returnValues.add(toEntity(value));
        }
        return returnValues;
    }

    public List<T1> toModel(List<T2> values) {
        List<T1> returnValues = new ArrayList<>(values.size());
        for (T2 value: values) {
            returnValues.add(toModel(value));
        }
        return returnValues;
    }
}
