import java.util.*;

public class FIRSTNONREPEATINGCHARACTER {


    static void firstNonRepeating(String str){


        Queue<Character> queue=new LinkedList<>();


        int[] freq=new int[26];



        for(char ch:str.toCharArray()){


            freq[ch-'a']++;


            queue.add(ch);



            while(!queue.isEmpty()
                    && freq[queue.peek()-'a']>1){


                queue.remove();
            }



            if(queue.isEmpty())

                System.out.print("-1 ");

            else

                System.out.print(queue.peek()+" ");
        }
    }



    public static void main(String[] args){


        String str="aabc";


        firstNonRepeating(str);

    }
}