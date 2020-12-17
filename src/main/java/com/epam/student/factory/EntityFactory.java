package com.epam.student.factory;

import com.epam.student.entity.Point;
import com.epam.student.exception.ShapeException;

public interface EntityFactory<T>{
    T create(Point... points) throws ShapeException;
}
