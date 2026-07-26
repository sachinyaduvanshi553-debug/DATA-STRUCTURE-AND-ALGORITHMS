import java.util.HashMap;
import java.util.Stack;

public class MAXFREQUENCYSTACK {

    static HashMap<Integer, Integer> freqMap;
    static HashMap<Integer, Stack<Integer>> groupMap;
    static int maxFreq;

    static void init() {
        freqMap = new HashMap<>();
        groupMap = new HashMap<>();
        maxFreq = 0;
    }

    static void push(int val) {
        int f = freqMap.getOrDefault(val, 0) + 1;
        freqMap.put(val, f);

        if (f > maxFreq) {
            maxFreq = f;
        }

        groupMap.computeIfAbsent(f, k -> new Stack<>()).push(val);
    }

    static int pop() {
        Stack<Integer> maxFreqStack = groupMap.get(maxFreq);
        int val = maxFreqStack.pop();

        freqMap.put(val, freqMap.get(val) - 1);

        if (maxFreqStack.isEmpty()) {
            maxFreq--;
        }

        return val;
    }


    public static void main(String[] args) {
        init();
        push(5);
        push(7);
        push(5);
        push(7);
        push(4);
        push(5);

        System.out.println(pop()); // 5
        System.out.println(pop()); // 7
        System.out.println(pop()); // 5
        System.out.println(pop()); // 4
    }
}
