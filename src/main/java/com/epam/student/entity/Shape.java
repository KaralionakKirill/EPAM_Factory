package com.epam.student.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Shape {
    private List<Point> pointList;
    private String name;

    public Shape(Point... points){
        pointList = Arrays.asList(points);
    }

    public List<Point> getPointList() {
        return new ArrayList<>(pointList);
    }

    public void setPointList(List<Point> pointList) {
        this.pointList = pointList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shape)) return false;
        Shape shape = (Shape) o;
        return (getName().equals(shape.getName()) && getPointList().equals(shape.getPointList()));
    }

    @Override
    public int hashCode() {
        int result = pointList.size();
        char[] chars = name.toCharArray();
        for (Character c : chars) {
            result = 31 * result + c;
        }
        return result;
    }
}
