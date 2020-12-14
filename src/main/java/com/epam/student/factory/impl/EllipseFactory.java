package com.epam.student.factory.impl;

import com.epam.student.entity.Point;
import com.epam.student.entity.impl.Ellipse;
import com.epam.student.factory.EntityFactory;

public class EllipseFactory implements EntityFactory<Ellipse> {
    private static EllipseFactory instance;

    private EllipseFactory(){}

    public static EllipseFactory getInstance() {
        if(instance == null){
            instance = new EllipseFactory();
        }
        return instance;
    }

    @Override
    public Ellipse create(Object... args) {
        Point firstPoint = (Point) args[0];
        Point secondPoint = (Point) args[1];
        return new Ellipse(firstPoint, secondPoint);
    }
}
