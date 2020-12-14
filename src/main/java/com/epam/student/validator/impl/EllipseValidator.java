package com.epam.student.validator.impl;

import com.epam.student.entity.Point;
import com.epam.student.validator.ShapeValidator;

public class EllipseValidator implements ShapeValidator {
    private static final String POINT_REGEX = "-?\\d+.\\d+";
    private static EllipseValidator instance;

    private EllipseValidator() {
    }

    public static EllipseValidator getInstance() {
        if (instance == null) {
            instance = new EllipseValidator();
        }
        return instance;
    }

    @Override
    public boolean isValidLine(String... lines) {
        return (lines[0].matches(POINT_REGEX) && lines[1].matches(POINT_REGEX) && lines.length == 2);
    }

    @Override
    public boolean isNotSamePoints(Point... points) {
        return (!(points[0].equals(points[1])));
    }
}
