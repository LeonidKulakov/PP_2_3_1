package web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.exception.InputDataException;
import web.service.CarService;

import java.util.Optional;

@RequiredArgsConstructor
@Controller
public class CarController {
    private final CarService carService;

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count") Optional<Integer> count, ModelMap model) {
        try {
            model.addAttribute("cars", carService.getCars(count.orElse(0)));
        } catch (InputDataException e) {
            return "invalidRequestPage";
        }
        return "car";
    }

}
