package com.epam.student.entity;

import java.util.Objects;

public class Point {
    private double x;
    private double y;

    public Point() {
    }

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        Point point = (Point) o;
        return (Double.compare(point.getX(), getX()) == 0 && Double.compare(point.getY(), getY()) == 0);
    }

    @Override
    public int hashCode() {
        return (int)(getX() * getY());
    }

    @Override
    public String toString() {
        StringBuilder str  = new StringBuilder("Point{");
        str.append("x=").append(x).append(", ");
        str.append("y=").append(y).append("}");
        return str.toString();
    }
}
