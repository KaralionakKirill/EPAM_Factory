package com.epam.student.factory.impl;

import com.epam.student.entity.Ellipse;
import com.epam.student.entity.Point;
import com.epam.student.exception.ShapeException;
import com.epam.student.factory.EntityFactory;
import com.epam.student.validator.impl.EllipseValidator;

public class EllipseFactory implements EntityFactory<Ellipse> {
    private static final EllipseFactory instance = new EllipseFactory();

    private EllipseFactory() {
    }

    public static EllipseFactory getInstance() {
        return instance;
    }

    @Override
    public Ellipse create(Point... points) throws ShapeException {
        EllipseValidator ellipseValidator = EllipseValidator.getInstance();
        Point firstPoint = points[0];
        Point secondPoint = points[1];
        if (!ellipseValidator.isNotSamePoints(firstPoint, secondPoint)) {
            throw new ShapeException("Same points!");
        }
        Ellipse ellipse = new Ellipse(firstPoint, secondPoint);
        return ellipse;
    }
}
