package com.epam.student.validator;

import com.epam.student.entity.Shape;

public interface ShapeValidator<T extends Shape> {
    boolean isValidLine(String... line);

    boolean isNotSamePoints(T o);
}
