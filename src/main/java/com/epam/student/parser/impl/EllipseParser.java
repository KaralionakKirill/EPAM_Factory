package com.epam.student.parser.impl;

import com.epam.student.entity.impl.Ellipse;
import com.epam.student.parser.ShapeParser;
import com.epam.student.validator.impl.EllipseValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EllipseParser implements ShapeParser<Ellipse> {
    private static final Logger logger = LogManager.getLogger(EllipseParser.class);
    private static EllipseParser instance;

    private EllipseParser(){}

    public static EllipseParser getInstance() {
        if(instance == null){
            instance = new EllipseParser();
        }
        return instance;
    }

    @Override
    public Ellipse parsingLine(String line) {
        String[] lineArray = line.split(" ");
        EllipseValidator validator = EllipseValidator.getInstance();
        if(validator.isValidLine(lineArray)){
            ///
        }
        return null;
    }
}
