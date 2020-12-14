package com.epam.student.entity;

public abstract class ShapeData {
    private double square;
    private double perimeter;

    public ShapeData(double square, double perimeter) {
        this.square = square;
        this.perimeter = perimeter;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ShapeData)) return false;
        ShapeData shapeData = (ShapeData) o;
        return Double.compare(shapeData.getSquare(), getSquare()) == 0 && Double.compare(shapeData.getPerimeter(), getPerimeter()) == 0;
    }

    @Override
    public int hashCode() {
        int result = (int) square;
        result = (int) (31 * result + square/perimeter);
        return result;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("ShapeData{");
        str.append("square=").append(square).append(", ");
        str.append("perimeter=").append(perimeter).append("}");
        return str.toString();
    }
}
