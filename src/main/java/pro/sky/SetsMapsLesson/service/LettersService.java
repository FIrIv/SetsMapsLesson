package pro.sky.SetsMapsLesson.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LettersService {

    List<String> text = new ArrayList<>(List.of("abc", "def", "abc", "aaa", "abc", "ddd", "eee", "eee", "aaa"));


    public List<String> uniq() {
        List<String> text2 = new ArrayList<>();
        for (int i=0; i<text.size(); i++) {
            if (text.get(i) == null) continue;
            String temp = text.get(i);
            if (!text2.contains(temp)) {
                text2.add(temp);
            }
        }
        return text2;
    }

    public Integer countOfRepeat() {
        Integer count = 0;
        List<String> text2 = uniq();
        for (int i=0; i<text2.size(); i++) {
            if (text2.get(i) == null) continue;
            String temp = text2.get(i);
            int temp_count = 0;
            for (int j=0; j<text.size(); j++) {
                if (text.get(j).equals(temp)) {
                    temp_count++;
                }
            }
            if (temp_count>1) count += temp_count;
        }
        return count;
    }
}
