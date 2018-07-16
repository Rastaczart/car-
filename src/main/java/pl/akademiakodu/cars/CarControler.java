package pl.akademiakodu.cars;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


@Controller
public class CarControler {

    private CarDao cardao = new CarStaticDao();

    @GetMapping("/")
    public String addCar() {
        return "add";
    }

    @GetMapping("/add")
    public String add(@ModelAttribute
                              Car car, ModelMap modelMap) {
        modelMap.put("car", car);
        cardao.addCar(car);
        return "show";
    }

    @GetMapping("/all")
    public String findAll(ModelMap modelMap) {
        modelMap.put("cars", cardao.findall());
        return "all";
    }
}

