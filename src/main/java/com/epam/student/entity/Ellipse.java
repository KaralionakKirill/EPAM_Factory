package com.epam.student.entity;

import com.epam.student.observer.Observable;
import com.epam.student.observer.Observer;
import com.epam.student.observer.impl.EllipseObserver;
import com.epam.student.validator.impl.EllipseValidator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ellipse extends Shape implements Observable<EllipseObserver> {
    private List<Point> pointList;
    private Observer<Ellipse> observer;

    public Ellipse(Point... points){
        pointList = Arrays.asList(points);
    }

    public List<Point> getPointList() {
        return new ArrayList<>(pointList);
    }

    public void setPointList(List<Point> pointList) {
        this.pointList = pointList;
        notifyObserver();
    }

    @Override
    public void attach(EllipseObserver observer) {
        this.observer = observer;
    }

    @Override
    public void detach() {
        observer = null;
    }

    @Override
    public void notifyObserver() {
        EllipseValidator validator = EllipseValidator.getInstance();
        if(observer != null && pointList.size() != 0){
            if(validator.isNotSamePoints(this)) {
                observer.update(this);
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shape)) return false;
        Ellipse shape = (Ellipse) o;
        if (getName() != null && getPointList().size() != 0) {
            return (getName().equals(shape.getName()) && getPointList().equals(shape.getPointList()));
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        for (Point point : pointList) {
            result = 31 * result + point.hashCode();
        }
        return result;
    }
}
