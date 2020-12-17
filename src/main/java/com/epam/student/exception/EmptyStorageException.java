package com.epam.student.exception;

public class EmptyStorageException extends Exception{
    public EmptyStorageException() {
    }

    public EmptyStorageException(String message) {
        super(message);
    }

    public EmptyStorageException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public EmptyStorageException(Throwable throwable) {
        super(throwable);
    }
}
