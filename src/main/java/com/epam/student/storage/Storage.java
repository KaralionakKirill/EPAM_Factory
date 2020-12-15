package com.epam.student.storage;

public interface Storage<T> {
    T get(String key);

    boolean remove(T o, String key);

    T put(T o, String key);

    boolean contain(T o);
}
