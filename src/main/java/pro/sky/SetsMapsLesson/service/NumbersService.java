package pro.sky.SetsMapsLesson.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NumbersService {

    List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    List<Integer> numsForDifficult = new ArrayList<>(List.of(2, 3, 4, 4, 5, 5, 6, 7, 9, 9, 9));

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

    private boolean isRepeat (Integer num, List<Integer> nums) {
        int count = 0;
        for (int i=0; i<nums.size(); i++) {
            if (nums.get(i) == null) continue;
            if (nums.get(i) == num) count ++;
        }
        if (count>1) return true;
        else return false;
    }

    public List<Integer> uniq1not0() {
        List<Integer> nums2 = new ArrayList<>();
        nums2.addAll(numsForDifficult);
        for (int i=0; i<numsForDifficult.size(); i++) {
            if (numsForDifficult.get(i) == null) continue;
            if (numsForDifficult.get(i) == 1) throw new RuntimeException("Не должно быть единиц!");
            if (isRepeat(numsForDifficult.get(i), numsForDifficult)) {
                nums2.set(i, 0);
            } else {
                nums2.set(i, 1);
            }
        }
        return nums2;
    }

    public Integer uniq1not0count() {
        int count = 0;
        List<Integer> nums2 = new ArrayList<>();
        nums2.addAll(numsForDifficult);
        for (int i=0; i<numsForDifficult.size(); i++) {
            if (numsForDifficult.get(i) == null) continue;
            if (numsForDifficult.get(i) == 1) throw new RuntimeException("Не должно быть единиц!");
            if (isRepeat(numsForDifficult.get(i), numsForDifficult)) {
                nums2.set(i, 0);
            } else {
                nums2.set(i, 1);
                count ++;
            }
        }
        return count;
    }
}
