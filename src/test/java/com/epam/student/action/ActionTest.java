package com.epam.student.action;

import com.epam.student.action.impl.EllipseAction;
import com.epam.student.entity.Ellipse;
import com.epam.student.entity.Point;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActionTest {
    EllipseAction action = EllipseAction.getInstance();
    Ellipse ellipse;

    @BeforeTest
    public void beforeTest() {
        Point firstPoint = new Point(-2, 2);
        Point secondPoint = new Point(2, 2);
        ellipse = new Ellipse(firstPoint, secondPoint);
    }

    @AfterTest
    public void afterTest() {
        ellipse = null;
    }

    @Test
    public void isEllipseTest() {
        boolean actual = action.isEllipse(ellipse);
        Assert.assertTrue(actual);
    }

    @Test
    public void testCrossAxis() {
        boolean actual = action.isCrossOneAxis(ellipse.getPointList());
        Assert.assertTrue(actual);
    }
}
