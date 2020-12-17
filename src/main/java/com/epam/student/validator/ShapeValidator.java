package com.epam.student.validator;

import com.epam.student.entity.Point;

public interface ShapeValidator {
    boolean isValidLine(String... line);

    boolean isNotSamePoints(Point... points);
}
