package com.epam.student.factory;

public interface EntityFactory<T>{
    T create(Object... args);
}
