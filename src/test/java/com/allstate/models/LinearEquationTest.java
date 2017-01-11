package com.allstate.models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class LinearEquationTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldCalculateDistanceBetweenTwoPoints() throws Exception {
        List<LinearEquation> points = new ArrayList<>();
        points.add(new LinearEquation(1,2));
        points.add(new LinearEquation(3,1));

        double result = LinearEquation.distance(points);
        assertEquals(2.2,result, 0.1);
    }

    @Test
    public void shouldCalculateSlopeBetweenTwoPoints() throws Exception {
        List<LinearEquation> points1 = new ArrayList<>();
        points1.add(new LinearEquation(1,2));
        points1.add(new LinearEquation(3,1));

        double result1 = LinearEquation.slope(points1);
        assertEquals(-0.5,result1, 0.1);

        List<LinearEquation> points = new ArrayList<>();
        points.add(new LinearEquation(3,6));
        points.add(new LinearEquation(4,1));

        double result = LinearEquation.slope(points);
        assertEquals(-5,result, 0.1);

        List<LinearEquation> points2 = new ArrayList<>();
        points2.add(new LinearEquation(4,3));
        points2.add(new LinearEquation(8,6));

        double result2 = LinearEquation.slope(points2);
        assertEquals(0.75,result2, 0.1);
    }

    @Test
    public void shouldCalculateYInterceptBetweenTwoPoints() throws Exception {
        List<LinearEquation> points = new ArrayList<>();
        points.add(new LinearEquation(1,2));
        points.add(new LinearEquation(3,1));

        double result = LinearEquation.yIntercept(points);
        assertEquals(1.5,result, 0.1);
    }
}