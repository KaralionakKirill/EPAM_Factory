package com.epam.student.storage.impl;

import com.epam.student.entity.impl.Ellipse;
import com.epam.student.storage.Storage;

import java.util.ArrayList;
import java.util.List;

public enum EllipseStorage implements Storage<Ellipse> {
    INSTANCE;

    private final List<Ellipse> ellipseList = new ArrayList<>();

    @Override
    public List<Ellipse> getList() {
        return new ArrayList<>(ellipseList);
    }

    @Override
    public Ellipse get(int index) {
        return ellipseList.get(index);
    }

    @Override
    public boolean add(Ellipse o) {
        return ellipseList.add(o);
    }

    @Override
    public boolean remove(Ellipse o) {
        return ellipseList.remove(o);
    }

    @Override
    public boolean contains(Ellipse o) {
        return ellipseList.contains(o);
    }

    @Override
    public int size() {
        return ellipseList.size();
    }
}
