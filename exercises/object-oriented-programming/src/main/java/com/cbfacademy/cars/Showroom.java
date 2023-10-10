package com.cbfacademy.cars;

import java.util.List;

public class Showroom {

    private List<Car> cars = List.of(
            new Car("Volvo", "V40", "blue", 2012),
            new Car("Porsche", "Panamera", "red", 2009),
            new Car("Audi", "A3", "grey", 2018));

    public List<Car> getCars() {
        return cars;
    }
}
