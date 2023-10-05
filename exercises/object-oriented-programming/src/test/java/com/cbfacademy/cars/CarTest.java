package com.cbfacademy.cars;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName(value = "Car tests")
public class CarTest {

    @ParameterizedTest
    @MethodSource("getCarArguments")
    @DisplayName("Car object has valid getMake method")
    public void testCarObjectHasValidGetMakeMethod(Car car, String make, String model, int year) {
        assertEquals(make, car.getMake());
    }

    @ParameterizedTest
    @MethodSource("getCarArguments")
    @DisplayName("Car object has valid getModel method")
    public void testCarObjectHasValidGetModelMethod(Car car, String make, String model, int year) {
        assertEquals(model, car.getModel());
    }

    @ParameterizedTest
    @MethodSource("getCarArguments")
    @DisplayName("Car object has valid getYear method")
    public void testCarObjectHasValidGetYearMethod(Car car, String make, String model, int year) {
        assertEquals(year, car.getYear());
    }

    @ParameterizedTest
    @MethodSource("getCarArguments")
    @DisplayName("Car object has valid getDetails method")
    public void testCarObjectHasValidGetDetailsMethod(Car car, String make, String model, int year) {
        String details = car.getDetails();

        assertTrue(details.indexOf(make) >= 0 && details.indexOf(model) >= 0
                && details.indexOf(Integer.toString(year)) >= 0);
    }
}
