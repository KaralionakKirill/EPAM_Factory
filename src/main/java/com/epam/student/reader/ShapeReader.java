package com.epam.student.reader;

import com.epam.student.exception.EmptyStorageException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ShapeReader {
    private static final Logger logger = LogManager.getLogger(ShapeReader.class);
    private static final String FILE_PATH = "/resources/data/";
    private static final String FILE_NAME_REGEX = "\\w+\\.txt";
    private static final ShapeReader instance = new ShapeReader();

    private ShapeReader() {
    }

    public static ShapeReader getInstance() {
        return instance;
    }

    public List<String> readFile(String fileName) throws EmptyStorageException {
        StringBuilder str = new StringBuilder(FILE_PATH);
        str.append(fileName);
        if (!fileName.matches(FILE_NAME_REGEX)) {
            str.append(".txt");
        }
        List<String> lineList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(str.toString()))) {
            lineList = bufferedReader.lines().collect(Collectors.toList());
        } catch (IOException e) {
            logger.error(e);
        }
        if (lineList.size() == 0) {
            throw new EmptyStorageException("Data not found!");
        }
        return lineList;
    }
}
