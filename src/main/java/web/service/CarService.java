package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    List<Car> cars = new ArrayList<>();
    {
        cars.add(new Car("Chevrolet", "Camaro SS", 1967));
        cars.add(new Car("Ford", "Mustang GT500", 1967));
        cars.add(new Car("Ferrari", "F-40", 1987));
        cars.add(new Car("Nissan", "Skyline GT-R R34 Z-Tune", 1987));
        cars.add(new Car("Shelby", "Cobra 427 S/C", 1967));
    }

    public List<Car> getCars(Integer quantity){
        if (quantity != null) {
            return cars.stream().limit((long) quantity).toList();
        } else return cars;
    }
}
