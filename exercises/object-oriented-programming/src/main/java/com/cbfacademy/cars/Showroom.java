package com.cbfacademy.cars;

import java.util.List;

public class Showroom {

    private List<Car> cars = List.of(
            new Car("Volvo", "V40", 2012),
            new Car("Porsche", "Panamera", 2009),
            new Car("Audi", "A3", 2018));

    public List<Car> getCars() {
        return cars;
    }
}
