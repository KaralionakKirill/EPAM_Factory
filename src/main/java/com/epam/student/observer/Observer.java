package com.epam.student.observer;

import com.epam.student.entity.Shape;

public interface Observer <T extends Shape>{
    void update(T o);
}
