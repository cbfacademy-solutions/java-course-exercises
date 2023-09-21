package com.cbfacademy.shapes;

/**
 * The Square class represents a square shape with a given width. It implements
 * the Enclosure interface to provide methods for calculating the perimeter and
 * area of the square.
 */
public class Square implements Enclosure {

    private double width;

    /**
     * Constructs a Square object with the specified width.
     *
     * @param width The width of the square.
     */
    public Square(double width) {
        this.width = width;
    }

    /**
     * Calculates and returns the perimeter of the square.
     *
     * @return The perimeter of the square.
     */
    @Override
    public double perimeter() {
        return 4 * width;
    }

    /**
     * Calculates and returns the area of the square.
     *
     * @return The area of the square.
     */
    @Override
    public double area() {
        return width * width;
    }

    /**
     * Gets the width of the square.
     *
     * @return The width of the square.
     */
    public double getWidth() {
        return width;
    }

    /**
     * Sets the width of the square.
     *
     * @param width The new width value to set.
     */
    public void setWidth(double width) {
        this.width = width;
    }
}
