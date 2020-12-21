package com.epam.student.factory;

import com.epam.student.entity.Ellipse;
import com.epam.student.entity.Point;
import com.epam.student.exception.ShapeException;
import com.epam.student.factory.impl.EllipseFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FactoryTest {
    EllipseFactory factory = EllipseFactory.getInstance();

    @Test
    public void factoryTest() throws ShapeException {
        Ellipse expected = null;
        Ellipse actual = factory.create(new Point(1,1), new Point(5,5));
        Assert.assertNotSame(expected, actual);
    }
}
