package com.epam.student.parser.impl;

import com.epam.student.entity.Point;
import com.epam.student.exception.ParserException;
import com.epam.student.parser.ShapeParser;
import com.epam.student.validator.impl.EllipseValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class EllipseParser implements ShapeParser {
    private static final Logger logger = LogManager.getLogger(EllipseParser.class);
    private static EllipseParser instance;

    private EllipseParser() {
    }

    public static EllipseParser getInstance() {
        if (instance == null) {
            instance = new EllipseParser();
        }
        return instance;
    }

    @Override
    public List<Point> parsingLine(String line) throws ParserException {
        String[] lineArray = line.split(" ");
        EllipseValidator validator = EllipseValidator.getInstance();
        List<Point> pointList = new ArrayList<>();
        if (validator.isValidLine(lineArray)) {
            pointList.add(new Point(Double.parseDouble(lineArray[0]), Double.parseDouble(lineArray[1])));
            pointList.add(new Point(Double.parseDouble(lineArray[2]), Double.parseDouble(lineArray[3])));
        } else {
            logger.info("String isn't valid: " + line);
            throw new ParserException();
        }
        return pointList;
    }
}
