package com.epam.student.factory.impl;

import com.epam.student.entity.Point;
import com.epam.student.entity.Ellipse;
import com.epam.student.factory.EntityFactory;

public class EllipseFactory implements EntityFactory<Ellipse> {
    private static final EllipseFactory instance = new EllipseFactory();

    private EllipseFactory(){}

    public static EllipseFactory getInstance() {
        return instance;
    }

    @Override
    public Ellipse create(Object... args) {
        Point firstPoint = (Point) args[0];
        Point secondPoint = (Point) args[1];
        return new Ellipse(firstPoint, secondPoint);
    }
}
