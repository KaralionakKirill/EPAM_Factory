package com.epam.student.repository;

import com.epam.student.entity.Shape;
import com.epam.student.specification.Specification;

import java.util.Comparator;
import java.util.List;

public interface Repository<T extends Shape>{
    List<T> getList();

    T get(int index);

    boolean add(T o);

    boolean remove(T o);

    boolean contains(T o);

    List<T> sort(Comparator<? super Shape> comparator);

    List<T> query(Specification<T> specification);

    int size();
}
