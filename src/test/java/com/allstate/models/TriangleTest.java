package com.allstate.models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by localadmin on 11/01/17.
 */
public class TriangleTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldComputeAreaOfListOfTriangles() throws Exception {
        Triangle t1 = new Triangle(3,4);
        Triangle t2 = new Triangle(5,6);

        List<Triangle> triangleList = new ArrayList<>();
        triangleList.add(t1);
        triangleList.add(t2);

        double result = Triangle.area(triangleList);
        assertEquals(21, result, 0.1);
    }

}