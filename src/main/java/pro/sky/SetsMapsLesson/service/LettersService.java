package pro.sky.SetsMapsLesson.service;

import org.springframework.stereotype.Service;

import java.util.*;

import static com.fasterxml.jackson.databind.type.LogicalType.Array;

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

    public List<Integer> countOfRepeat() {
        List<Integer> count = new ArrayList<>();
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
            if (temp_count>1) count.add(temp_count);
        }
        return count;
    }

    public boolean likeByLetters(String word1temp, String word2temp) {
        Set<Character> word1 = new HashSet<>();
        Set<Character> word2 = new HashSet<>();
        for (int i=0; i<word1temp.length(); i++) {
            word1.add(word1temp.charAt(i));
        }
        for (int i=0; i<word2temp.length(); i++) {
            word2.add(word2temp.charAt(i));
        }
        if (word1.equals(word2)) return true;
        else return false;
    }

    public boolean anagram(String word1temp, String word2temp) {
        if (word1temp.length() != word2temp.length()) return false;

        List<Character> word1 = new ArrayList<>();
        List<Character> word2 = new ArrayList<>();
        for (int i=0; i<word1temp.length(); i++) {
            word1.add(word1temp.charAt(i));
            word2.add(word2temp.charAt(i));
        }
        for (int i=0; i< word1.size(); i++) {
            if (word1.get(i) != word2.get(word2.size()-1-i)) return false;
        }
        return true;
    }
}
