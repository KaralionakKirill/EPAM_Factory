package com.epam.student.specification.impl;

import com.epam.student.entity.Ellipse;
import com.epam.student.entity.Point;
import com.epam.student.specification.Specification;

public class PointIntervalSpecification implements Specification<Ellipse> {
    private Point pointFrom;
    private Point pointTo;

    public PointIntervalSpecification(Point pointFrom,Point pointTo) {
        this.pointFrom = pointFrom;
        this.pointTo = pointTo;
    }

    @Override
    public boolean specify(Ellipse ellipse) {
        Point firstPoint = ellipse.getPointList().get(0);
        Point secondPoint = ellipse.getPointList().get(1);
        return (firstPoint.getX() >= pointFrom.getX() && secondPoint.getX() <= pointTo.getX())
                && (firstPoint.getY() >= pointFrom.getY() && secondPoint.getY() <= pointTo.getY());
    }
}
