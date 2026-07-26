import java.util.LinkedList;
import java.util.Queue;

public class STUDENTSUNABLETOEATLUNCH {



    static int countStudents(int[] students, int[] sandwiches) {


        Queue<Integer> queue = new LinkedList<>();



        for(int student : students) {

            queue.add(student);
        }



        int sandwichIndex = 0;


        int unableCount = 0;



        while(!queue.isEmpty()
                && unableCount < queue.size()) {



            int student = queue.peek();



            if(student == sandwiches[sandwichIndex]) {



                queue.remove();


                sandwichIndex++;


                unableCount = 0;



            } else {



                queue.add(queue.remove());


                unableCount++;
            }
        }



        return queue.size();

    }





    public static void main(String[] args) {



        int[] students = {1,1,0,0};


        int[] sandwiches = {0,1,0,1};



        int result =
                countStudents(students,sandwiches);



        System.out.println(
                "Students unable to eat: "
                        + result
        );

    }
}