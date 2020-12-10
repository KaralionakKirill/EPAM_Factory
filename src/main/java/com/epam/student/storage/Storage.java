package com.epam.student.storage;

import com.epam.student.entity.Shape;

import java.util.List;

public interface Storage <T extends Shape>{
    List<T> getList();

    T get(int index);

    boolean add(T o);

    boolean remove(T o);

    boolean contains(T o);

    int size();
}
