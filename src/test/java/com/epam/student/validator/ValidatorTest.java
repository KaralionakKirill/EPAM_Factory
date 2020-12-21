package com.epam.student.validator;

import com.epam.student.entity.Point;
import com.epam.student.validator.impl.EllipseValidator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidatorTest {
    EllipseValidator validator = EllipseValidator.getInstance();

    @Test
    public void testLineCheck() {
        boolean actual = validator.isValidLine("2.56", "-1.33");
        Assert.assertTrue(actual);
    }

    @Test
    public void testPointCheck() {
        boolean actual = validator.isNotSamePoints(new Point(2.56, 1.33), new Point(0,56));
        Assert.assertTrue(actual);
    }
}
