package com.epam.student.specification;

import com.epam.student.entity.Shape;

public interface Specification<T extends Shape> {
    boolean specify(T o);
}
