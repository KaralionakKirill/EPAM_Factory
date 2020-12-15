package com.epam.student.storage.impl;

import com.epam.student.entity.EllipseData;
import com.epam.student.storage.Storage;

import java.util.HashMap;
import java.util.Map;

public enum EllipseDataStorage implements Storage<EllipseData> {
    INSTANCE;
    private final Map<String, EllipseData> ellipseDataMap = new HashMap<>();

    @Override
    public EllipseData get(String key) {
        return ellipseDataMap.get(key);
    }

    @Override
    public boolean remove(EllipseData o, String key) {
        return ellipseDataMap.remove(key, o);
    }

    @Override
    public EllipseData put(EllipseData o, String key) {
        return ellipseDataMap.put(key, o);
    }

    @Override
    public boolean contain(EllipseData o) {
        return ellipseDataMap.containsValue(o);
    }
}
