package pro.sky.SetsMapsLesson.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class NumbersService {

    List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));


    public List<Integer> chet() {
        List<Integer> nums2 = new ArrayList<>();
        for (int i=0; i<nums.size(); i++) {
            if (nums.get(i) == null) continue;
            Integer temp = nums.get(i);
            if (temp % 2 == 0 && !nums2.contains(temp)) {
                nums2.add(temp);
            }
        }
        return nums2;
    }

    public List<Integer> nechet() {
        List<Integer> nums2 = new ArrayList<>();
        for (int i=0; i<nums.size(); i++) {
            if (nums.get(i) == null) continue;
            Integer temp = nums.get(i);
            if (temp % 2 != 0 && !nums2.contains(temp)) {
                nums2.add(temp);
            }
        }
        return nums2;
    }
}
