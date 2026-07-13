public class FIRSTOCCURRENCEINSTRING {

    public int strStr(String haystack, String needle) {

        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {

        FIRSTOCCURRENCEINSTRING obj =
                new FIRSTOCCURRENCEINSTRING();

        System.out.println(
                obj.strStr("sadbutsad", "sad")
        );
    }
}