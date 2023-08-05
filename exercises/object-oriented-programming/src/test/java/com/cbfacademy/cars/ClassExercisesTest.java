package com.cbfacademy.cars;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName(value = "Class exercises tests")
public class ClassExercisesTest {

    @Test
    @DisplayName("Showroom object has a valid getCars method")
    public void testShowroomObjectHasValidListMethod() {
        List<HashMap<String, Object>> carValues = getCarValues();
        List<Car> cars = new Showroom().getCars();

        for (HashMap<String, Object> expected : carValues) {
            assertTrue(hasMatch(cars, expected));
        }
    }

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

    private static Stream<Arguments> getCarArguments() {
        List<HashMap<String, Object>> cars = getCarValues();

        return cars.stream()
                .map(map -> {
                    String make = (String) map.get("make");
                    String model = (String) map.get("model");
                    int year = (int) map.get("year");

                    return Arguments.of(new Car(make, model, year), make, model, year);
                });
    }

    private static List<HashMap<String, Object>> getCarValues() {
        List<HashMap<String, Object>> cars = List.of(
                new HashMap<>() {
                    {
                        put("make", "Volvo");
                        put("model", "V40");
                        put("year", 2012);
                    }
                },
                new HashMap<>() {
                    {
                        put("make", "Porsche");
                        put("model", "Panamera");
                        put("year", 2009);
                    }
                },
                new HashMap<>() {
                    {
                        put("make", "Audi");
                        put("model", "A3");
                        put("year", 2018);
                    }
                });
        return cars;
    }

    private static boolean hasMatch(List<Car> cars, HashMap<String, Object> map) {
        for (Car car : cars) {
            boolean match = true;
            String make = (String) map.get("make");

            if (make != null && !car.getMake().equals(make)) {
                match = false;
            }

            String model = (String) map.get("model");

            if (model != null && !car.getModel().equals(model)) {
                match = false;
            }

            Integer year = (Integer) map.get("year");

            if (year != null && car.getYear() != year) {
                match = false;
            }

            if (match) {
                return true;
            }
        }

        return false;
    }
}
