package com.epam.student.entity.impl;

import com.epam.student.entity.Point;
import com.epam.student.entity.Shape;

import java.util.Arrays;

public class Ellipse extends Shape {
    public Ellipse(Point... points){
        setPointList(Arrays.asList(points));
    }

}
