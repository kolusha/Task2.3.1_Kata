package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarsServiceImpl;

@Controller
public class CarsController {

    final CarsServiceImpl carsService;

    @Autowired
    public CarsController(CarsServiceImpl carsService) {
        this.carsService = carsService;
    }

    @GetMapping("/cars")
    public String getCars(@RequestParam(defaultValue = "0") String count,
                          Model model) {
        int CARS_COUNT = 0;

        carsService.saveCar(++CARS_COUNT, "Model1", 100, "white");
        carsService.saveCar(++CARS_COUNT, "Model2", 200, "black");
        carsService.saveCar(++CARS_COUNT, "Model3", 300, "blue");
        carsService.saveCar(++CARS_COUNT, "Model4", 400, "gray");
        carsService.saveCar(++CARS_COUNT, "Model5", 500, "yellow");
        carsService.saveCar(++CARS_COUNT, "Model6", 600, "green");

        model.addAttribute("cars", carsService.getAllCars(count));
        return "cars";
    }
}
