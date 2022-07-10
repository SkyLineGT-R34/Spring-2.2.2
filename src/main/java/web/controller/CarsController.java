package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {
    @GetMapping(value = "/cars")
    public String printCars(ModelMap model, @RequestParam(value = "count", required = false) Integer count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Chevrolet","Camaro SS",1967));
        cars.add(new Car("Ford","Mustang GT500",1967));
        cars.add(new Car("Ferrari", "F-40", 1987));
        cars.add(new Car("Nissan", "Skyline GT-R R34 Z-Tune", 1987));
        cars.add(new Car("Shelby", "Cobra 427 S/C", 1967));
        if (count != null) {
            for (int i= cars.size()-1; i>=count;i--) {
                cars.remove(i);
            }
        }
        model.addAttribute("cars", cars);
        return "cars";
    }


}