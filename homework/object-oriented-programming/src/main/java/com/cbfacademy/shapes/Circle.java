package com.cbfacademy.shapes;

/**
 * The Circle class represents a circle shape with a given radius. It implements
 * the Enclosure interface to provide methods for calculating the perimeter and
 * area of the circle.
 */
public class Circle implements Enclosure {

    private double radius;

    /**
     * Constructs a Circle object with the specified radius.
     *
     * @param radius The radius of the circle.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Calculates and returns the perimeter of the circle.
     *
     * @return The perimeter of the circle.
     */
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * Calculates and returns the area of the circle.
     *
     * @return The area of the circle.
     */
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    /**
     * Gets the radius of the circle.
     *
     * @return The radius of the circle.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Sets the radius of the circle.
     *
     * @param radius The new radius value to set.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
}
