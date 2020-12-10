package com.epam.student.reader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ShapeReader {
    private static final Logger logger = LogManager.getLogger(ShapeReader.class);
    private static final String FILE_PATH = "src/main/resources/data/";
    private static ShapeReader instance;

    private ShapeReader() {
    }

    public ShapeReader getInstance() {
        if (instance == null) {
            instance = new ShapeReader();
        }
        return instance;
    }

    public List<String> readFile(String fileName) {
        StringBuilder str = new StringBuilder(FILE_PATH);
        str.append(fileName).append(".txt");
        List<String> lineList = null;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(str.toString()))) {
            Stream<String> lines = bufferedReader.lines();
            lineList = lines.collect(Collectors.toList());
        } catch (IOException e) {
            logger.error(e);
        }
        return lineList;
    }
}
