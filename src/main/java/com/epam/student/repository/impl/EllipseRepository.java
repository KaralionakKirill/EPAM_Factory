package com.epam.student.repository.impl;

import com.epam.student.entity.Shape;
import com.epam.student.entity.Ellipse;
import com.epam.student.repository.Repository;
import com.epam.student.specification.Specification;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public enum EllipseRepository implements Repository<Ellipse> {
    INSTANCE;

    private final List<Ellipse> ellipseList = new ArrayList<>();

    @Override
    public List<Ellipse> getList() {
        return new ArrayList<>(ellipseList);
    }

    @Override
    public Ellipse get(int index) {
        return ellipseList.get(index);
    }

    @Override
    public boolean add(Ellipse o) {
        return ellipseList.add(o);
    }

    @Override
    public boolean remove(Ellipse o) {
        return ellipseList.remove(o);
    }

    @Override
    public boolean contains(Ellipse o) {
        return ellipseList.contains(o);
    }

    @Override
    public List<Ellipse> sort(Comparator<? super Shape> comparator) {
        List<Ellipse> list = new ArrayList<>(ellipseList);
        list.sort(comparator);
        return list;
    }

    @Override
    public List<Ellipse> query(Specification<Ellipse> specification) {
        return ellipseList.stream().filter(specification::specify).collect(Collectors.toList());
    }

    @Override
    public int size() {
        return ellipseList.size();
    }
}
