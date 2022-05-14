package pro.sky.SetsMapsLesson.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.SetsMapsLesson.service.NumbersService;

import java.util.List;

@RestController
@RequestMapping("/check/numbers")
public class NumbersController {

    private final NumbersService numbersService;

    public NumbersController (NumbersService numbersService) {
        this.numbersService = numbersService;
    }

    @GetMapping("/chet")
    public List<Integer> chet () {
        return numbersService.chet();
    }

    @GetMapping("/nechet")
    public List<Integer> nechet () {
        return numbersService.nechet();
    }

    @GetMapping("/uniq1not0")
    public List<Integer> uniq1not0 () {
        return numbersService.uniq1not0();
    }

    @GetMapping("/uniq1not0count")
    public Integer uniq1not0count () {
        return numbersService.uniq1not0count();
    }
}
