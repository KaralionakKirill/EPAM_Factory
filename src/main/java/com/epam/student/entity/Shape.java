package com.epam.student.entity;

import java.util.UUID;

public abstract class Shape {
    private final String name = UUID.randomUUID().toString();

    public Shape() {
    }

    public String getName() {
        return name;
    }
}
