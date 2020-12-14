package com.epam.student.storage;

import com.epam.student.entity.ShapeData;

public interface Storage<T extends ShapeData> {
    boolean remove(T o, String key);

    T put(T o, String key);

}
