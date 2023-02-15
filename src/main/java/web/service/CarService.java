package web.service;

import web.model.Car;

import java.util.List;

public class CarService {
    public static List<List<String>> getLimitCars(List<Car> cars, Integer count) {
        return cars.stream().limit(count).map(Car::toStringArray).toList();
    }
}
