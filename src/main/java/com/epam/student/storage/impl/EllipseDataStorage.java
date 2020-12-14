package com.epam.student.storage.impl;

import com.epam.student.entity.impl.EllipseData;
import com.epam.student.storage.Storage;

import java.util.HashMap;
import java.util.Map;

public enum EllipseDataStorage implements Storage<EllipseData> {
    INSTANCE;
    private final Map<String, EllipseData> ellipseDataMap = new HashMap<>();

    @Override
    public boolean remove(EllipseData o, String key) {
        return ellipseDataMap.remove(key, o);
    }

    @Override
    public EllipseData put(EllipseData o, String key) {
        return ellipseDataMap.put(key, o);
    }
}
