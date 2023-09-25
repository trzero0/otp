package com.example;

public class Main {

    public static void main(String[] args) {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(3, 4);
        
        double distance = DistanceCalculator.calculateDistance(point1, point2);
        
        System.out.println("The distance between the two points is: " + distance);
    }
}
