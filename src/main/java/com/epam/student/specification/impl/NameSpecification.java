package com.epam.student.specification.impl;

import com.epam.student.entity.impl.Ellipse;
import com.epam.student.specification.Specification;

public class NameSpecification implements Specification<Ellipse> {
    private String name;

    public NameSpecification(String name) {
        this.name = name;
    }

    @Override
    public boolean specify(Ellipse o) {
        return o.getName().equals(name);
    }
}
