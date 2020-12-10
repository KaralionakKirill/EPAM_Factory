package com.epam.student.exception;

public class ShapeException extends Exception{
    public ShapeException() {
    }

    public ShapeException(String message) {
        super(message);
    }

    public ShapeException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public ShapeException(Throwable throwable) {
        super(throwable);
    }
}
