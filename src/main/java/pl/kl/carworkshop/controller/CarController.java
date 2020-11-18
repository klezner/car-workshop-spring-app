package pl.kl.carworkshop.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.kl.carworkshop.service.CarService;

@Controller
@RequiredArgsConstructor
@RequestMapping("/car")
public class CarController {

    private final CarService carService;

    @GetMapping("")
    public String getCars(Model model) {
        model.addAttribute("listOfCars", carService.findAll());
        return "car_list";
    }
}
