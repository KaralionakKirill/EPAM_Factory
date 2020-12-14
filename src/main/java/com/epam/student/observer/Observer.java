package com.epam.student.observer;

import com.epam.student.entity.Shape;

public interface Observer <T extends Shape>{
    void performedPerimeter(T o);
    void performedSquare(T o);
}
