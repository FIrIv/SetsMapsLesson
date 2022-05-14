package pro.sky.SetsMapsLesson.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("/like-by-letters")
    public boolean likeByLetters (@RequestParam("word1") String word1, @RequestParam("word2")  String word2) {
        return lettersService.likeByLetters(word1, word2);
    }

    @GetMapping("/anagram")
    public boolean anagram (@RequestParam("word1") String word1, @RequestParam("word2") String word2) {
        return lettersService.anagram(word1, word2);
    }
}
