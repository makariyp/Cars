package web.controller;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    private List<Car> list = new ArrayList<>();

    public CarController() {
        for (int i = 0; i < 5; i++) {
            list.add(new Car("Car" + i, 2000 + i, i));
        }
    }

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(defaultValue = "5") Integer count, ModelMap model) {
        model.addAttribute("messages", list.stream().map(Car::toStringArray).limit(count).toList());
        return "cars";
    }
}