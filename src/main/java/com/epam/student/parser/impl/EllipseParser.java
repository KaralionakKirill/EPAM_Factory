package com.epam.student.parser.impl;

import com.epam.student.entity.Point;
import com.epam.student.exception.ParserException;
import com.epam.student.parser.ShapeParser;
import com.epam.student.validator.impl.EllipseValidator;

import java.util.ArrayList;
import java.util.List;

public class EllipseParser implements ShapeParser {
    private static final String LINE_SPLIT = " ";
    private static final EllipseParser instance = new EllipseParser();

    private EllipseParser() {
    }

    public static EllipseParser getInstance() {
        return instance;
    }

    @Override
    public List<Point> parsingLine(String line) throws ParserException {
        String[] lineArray = line.split(LINE_SPLIT);
        EllipseValidator validator = EllipseValidator.getInstance();
        List<Point> pointList = new ArrayList<>();
        if (validator.isValidLine(lineArray)) {
            pointList.add(new Point(Double.parseDouble(lineArray[0]), Double.parseDouble(lineArray[1])));
            pointList.add(new Point(Double.parseDouble(lineArray[2]), Double.parseDouble(lineArray[3])));
        } else {
            throw new ParserException("This line isn't valid: " + line);
        }
        return pointList;
    }
}
