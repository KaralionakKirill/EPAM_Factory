package com.epam.student.validator.impl;

import com.epam.student.validator.ShapeValidator;

public class EllipseValidator implements ShapeValidator {
    private static EllipseValidator instance;
    private static final String POINT_REGEX = "-?\\d+.\\d+";

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
}
