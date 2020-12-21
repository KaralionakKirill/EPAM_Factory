package com.epam.student.specification.impl;

import com.epam.student.entity.Ellipse;
import com.epam.student.entity.EllipseData;
import com.epam.student.specification.Specification;
import com.epam.student.storage.impl.EllipseDataStorage;

public class SquareSpecification implements Specification<Ellipse> {
    private Double square;

    public SquareSpecification(Double square) {
        this.square = square;
    }

    @Override
    public boolean specify(Ellipse ellipse) {
        EllipseDataStorage storage = EllipseDataStorage.INSTANCE;
        EllipseData ellipseData = storage.get(ellipse.getName());
        return Double.compare(ellipseData.getPerimeter(), square) == 1;
    }
}
