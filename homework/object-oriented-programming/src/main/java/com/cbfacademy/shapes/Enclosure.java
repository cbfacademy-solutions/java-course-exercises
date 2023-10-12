package com.cbfacademy.shapes;

/**
 * The Enclosure interface represents a geometrical shape that can be enclosed
 * by some boundary. It provides methods to calculate the perimeter and area of
 * the shape.
 */
public interface Enclosure {

    /**
     * Calculates and returns the perimeter of the geometrical shape.
     *
     * @return The perimeter of the shape.
     */
    double perimeter();

    /**
     * Calculates and returns the surface area of the geometrical shape.
     *
     * @return The surface area of the shape.
     */
    double area();
}
