package com.epam.student.factory;

import com.epam.student.entity.Shape;

public interface ShapeFactory <T extends Shape>{
    T create(Object... args);
}
