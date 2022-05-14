package pro.sky.SetsMapsLesson.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.SetsMapsLesson.service.LettersService;

import java.util.List;

@RestController
@RequestMapping("/check/letters")
public class LettersController {

    private final LettersService lettersService;

    public LettersController (LettersService lettersService) {
        this.lettersService = lettersService;
    }

    @GetMapping("/uniq")
    public List<String> uniq () {
        return lettersService.uniq();
    }

    @GetMapping("/repeatcount")
    public List <Integer> countOfRepeat () {
        return lettersService.countOfRepeat();
    }
}
