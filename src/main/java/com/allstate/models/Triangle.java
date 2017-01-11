package com.allstate.models;

import java.util.List;

public class Triangle {
    private int height;
    private int width;

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }

    public Triangle() {
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public double getArea(){
        return (this.height * this.width * 0.5);
    }

    public Triangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public static double area(List<Triangle> triangles) {

        Double area = triangles
                .stream()
                .map( (tri) -> (tri.height * tri.width * 0.5))
                .reduce((double) 0, (acc, val) -> acc + val);
        return area;
    }

}
