package com.epam.student.factory.impl;

import com.epam.student.entity.EllipseData;
import com.epam.student.factory.EntityFactory;

public class EllipseDataFactory implements EntityFactory<EllipseData> {
    private static final EllipseDataFactory instance = new EllipseDataFactory();
    private EllipseDataFactory(){};

    public static EllipseDataFactory getInstance(){
        return instance;
    }

    @Override
    public EllipseData create(Object... args) {
        double perimeter = (double) args[0];
        double square = (double) args[1];
        return new EllipseData(square, perimeter);
    }
}
