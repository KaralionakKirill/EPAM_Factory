package com.epam.student.action.impl;

import com.epam.student.action.ShapeAction;
import com.epam.student.entity.Point;
import com.epam.student.entity.impl.Ellipse;

import java.util.List;

public class EllipseAction implements ShapeAction<Ellipse> {

    public boolean isCorrectPoints(List<Point> pointList){
        Point firstPoint = pointList.get(0);
        Point secondPoint = pointList.get(1);
        return ((firstPoint.getY() != secondPoint.getY()) && (firstPoint.getX() != secondPoint.getX()));
    }

    public boolean isEllipse(Ellipse shape) {
        return (majorAxis(shape.getPointList()) != minorAxis(shape.getPointList()));
    }

    private double majorAxis(List<Point> pointList) {
        return Math.abs(pointList.get(0).getX() - pointList.get(1).getX());
    }

    private double minorAxis(List<Point> pointList) {
        return Math.abs(pointList.get(0).getY() - pointList.get(1).getY());
    }

    @Override
    public double shapeSquare(Ellipse shape) {
        return (Math.PI * majorAxis(shape.getPointList()) * minorAxis(shape.getPointList()) / 4);
    }

    @Override
    public double perimeterSquare(Ellipse shape) {
        double res = Math.PI * majorAxis(shape.getPointList()) * minorAxis(shape.getPointList());
        res += (majorAxis(shape.getPointList()) - minorAxis(shape.getPointList()));
        res *= 4;
        res /= (majorAxis(shape.getPointList()) + minorAxis(shape.getPointList()));
        return res;
    }
}