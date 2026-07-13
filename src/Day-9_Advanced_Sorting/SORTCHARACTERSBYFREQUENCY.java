import java.util.*;

public class SORTCHARACTERSBYFREQUENCY {

    public String frequencySort(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<Character> chars = new ArrayList<>(map.keySet());

        chars.sort((a, b) -> map.get(b) - map.get(a));

        StringBuilder result = new StringBuilder();

        for (char c : chars) {

            int freq = map.get(c);

            while (freq-- > 0) {
                result.append(c);
            }
        }

        return result.toString();
    }
}