package com.epam.student.factory.impl;

import com.epam.student.entity.impl.EllipseData;
import com.epam.student.factory.EntityFactory;

public class EllipseDataFactory implements EntityFactory<EllipseData> {
    private static EllipseDataFactory instance;
    private EllipseDataFactory(){};

    public static EllipseDataFactory getInstance(){
        if(instance == null){
            instance = new EllipseDataFactory();
        }
        return instance;
    }

    @Override
    public EllipseData create(Object... args) {
        double perimeter = (double) args[0];
        double square = (double) args[1];
        return new EllipseData(square, perimeter);
    }
}
