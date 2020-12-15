package com.epam.student.validator.impl;

import com.epam.student.entity.Ellipse;
import com.epam.student.entity.Point;
import com.epam.student.validator.ShapeValidator;

public class EllipseValidator implements ShapeValidator<Ellipse> {
    private static final String POINT_REGEX = "-?\\d+.\\d+";
    private static final EllipseValidator instance = new EllipseValidator();

    private EllipseValidator() {
    }

    public static EllipseValidator getInstance() {
        return instance;
    }

    @Override
    public boolean isValidLine(String... lines) {
        return (lines[0].matches(POINT_REGEX) && lines[1].matches(POINT_REGEX) && lines.length == 2);
    }

    @Override
    public boolean isNotSamePoints(Ellipse ellipse) {
        Point firstPoint = ellipse.getPointList().get(0);
        Point secondPoint = ellipse.getPointList().get(1);
        return (!(firstPoint.equals(secondPoint)));
    }
}
