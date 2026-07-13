import java.util.*;

public class RELATIVESORTARRAY {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int index = 0;

        for (int num : arr2) {

            while (map.getOrDefault(num, 0) > 0) {

                arr1[index++] = num;
                map.put(num, map.get(num) - 1);
            }
        }

        List<Integer> remaining = new ArrayList<>();

        for (int num : map.keySet()) {

            while (map.get(num) > 0) {

                remaining.add(num);
                map.put(num, map.get(num) - 1);
            }
        }

        Collections.sort(remaining);

        for (int num : remaining) {
            arr1[index++] = num;
        }

        return arr1;
    }
}