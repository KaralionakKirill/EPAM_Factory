package com.epam.student.observer.impl;

import com.epam.student.action.impl.EllipseAction;
import com.epam.student.entity.Ellipse;
import com.epam.student.entity.EllipseData;
import com.epam.student.observer.Observer;
import com.epam.student.storage.impl.EllipseDataStorage;

public class EllipseObserver implements Observer<Ellipse> {

    @Override
    public void update(Ellipse o) {
        EllipseDataStorage storage = EllipseDataStorage.INSTANCE;
        EllipseData ellipseData = storage.get(o.getName());
        EllipseAction action = EllipseAction.getInstance();
        double perimeter =  action.shapePerimeter(o);
        double square =  action.shapeSquare(o);
        ellipseData.setSquare(square);
        ellipseData.setPerimeter(perimeter);
        storage.put(ellipseData, o.getName());
    }
}
