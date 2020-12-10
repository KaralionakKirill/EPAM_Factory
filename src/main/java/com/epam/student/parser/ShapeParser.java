package com.epam.student.parser;

import com.epam.student.entity.Shape;

public interface ShapeParser<T extends Shape> {
    T parsingLine(String line);
}
