package com.epam.student.observer.impl;

import com.epam.student.action.impl.EllipseAction;
import com.epam.student.entity.impl.Ellipse;
import com.epam.student.factory.impl.EllipseDataFactory;
import com.epam.student.observer.Observer;
import com.epam.student.storage.impl.EllipseDataStorage;

public class EllipseObserver implements Observer<Ellipse> {

    @Override
    public void performedPerimeter(Ellipse o) {
        EllipseDataFactory factory = EllipseDataFactory.getInstance();
        EllipseAction action = EllipseAction.getInstance();
        double perimeter =  action.shapePerimeter(o);
        EllipseDataStorage ellipseDataStorage = EllipseDataStorage.INSTANCE;
        ellipseDataStorage.put(factory.create(perimeter), o.getName());
    }

    @Override
    public void performedSquare(Ellipse o) {
        EllipseDataFactory factory = EllipseDataFactory.getInstance();
        EllipseAction action = EllipseAction.getInstance();
        double square =  action.shapeSquare(o);
        EllipseDataStorage ellipseDataStorage = EllipseDataStorage.INSTANCE;
        ellipseDataStorage.put(factory.create(square), o.getName());
    }
}
