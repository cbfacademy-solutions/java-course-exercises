package com.cbfacademy.shapes;

/**
 * An abstract class representing a Shape.
 */
public abstract class Shape {
    protected String shapeName;

    /**
     * Abstract method to calculate the area of the shape.
     *
     * @return The area of the shape.
     */
    public abstract double getArea();

    /**
     * Get the name of the shape.
     *
     * @return The name of the shape.
     */
    public String getName() {
        return shapeName;
    }
}
