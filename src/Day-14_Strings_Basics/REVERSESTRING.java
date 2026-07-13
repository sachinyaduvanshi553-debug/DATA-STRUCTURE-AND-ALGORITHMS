import java.util.Arrays;

public class REVERSESTRING {

    public void reverseString(char[] s) {

        int left = 0;
        int right = s.length - 1;

        while (left < right) {

            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        REVERSESTRING obj = new REVERSESTRING();

        char[] arr = {'h', 'e', 'l', 'l', 'o'};

        obj.reverseString(arr);

        System.out.println(Arrays.toString(arr));
    }
}