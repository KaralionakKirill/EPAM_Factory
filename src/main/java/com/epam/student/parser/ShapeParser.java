package com.epam.student.parser;

import com.epam.student.entity.Point;
import com.epam.student.exception.ParserException;

import java.util.List;

public interface ShapeParser{
    List<Point> parsingLine(String line) throws ParserException;
}
