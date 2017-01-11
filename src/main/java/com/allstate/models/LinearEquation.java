package com.allstate.models;

import java.lang.*;
import java.util.List;

public class LinearEquation {
    private int xCoordinate;
    private int yCoordinate;

    public LinearEquation(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public LinearEquation() {
    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public static double distance(List<LinearEquation> points) {
        int value = 0;
        int diffYCord = points.get(1).getyCoordinate() - points.get(0).getyCoordinate();
        int diffXCord = points.get(1).getxCoordinate() - points.get(0).getxCoordinate();
        value = (diffXCord * diffXCord) + (diffYCord * diffYCord);
        double distance = java.lang.Math.sqrt(value);
        return distance;
    }

    public static double slope(List<LinearEquation> points) {
        double slope = 0;
        int diffYCord = points.get(1).getyCoordinate() - points.get(0).getyCoordinate();
        int diffXCord = points.get(1).getxCoordinate() - points.get(0).getxCoordinate();
        slope = (double)diffYCord/diffXCord;
        return slope;
    }

    public static double yIntercept(List<LinearEquation> points) {
        double yIntercept = 0;
        yIntercept = (points.get(0).getxCoordinate() * slope(points)) + points.get(0).getyCoordinate();

        System.out.println("Y: " + yIntercept);
        return yIntercept;
    }
}
