import java.util.List;

public class SKYLINEPROBLEM {

    public List<List<Integer>> getSkyline(int[][] buildings) {
        return null;
    }

    public static void main(String[] args) {

        SKYLINEPROBLEM obj = new SKYLINEPROBLEM();

        int[][] buildings = {
                {2, 9, 10},
                {3, 7, 15},
                {5, 12, 12},
                {15, 20, 10},
                {19, 24, 8}
        };

        System.out.println(
                obj.getSkyline(buildings)
        );
    }
}