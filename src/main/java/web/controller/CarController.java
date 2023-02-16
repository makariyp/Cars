package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    private final List<Car> list;

    @Autowired
    public CarController(List<Car> list) {
        this.list = list;
    }

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(defaultValue = "5") Integer count, ModelMap model) {
        model.addAttribute("cars", CarService.getLimitCars(list, count));
        return "cars";
    }
}
