package com.epam.student.action;

import com.epam.student.entity.Shape;

public interface ShapeAction <T extends Shape>{
    double shapeSquare(T shape);

    double shapePerimeter(T shape);
}
