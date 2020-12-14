package com.epam.student.observer;

public interface Observable<T extends Observer>{
    void attach(T observer);
    void detach(T observer);
    void notifyObserver();
}
