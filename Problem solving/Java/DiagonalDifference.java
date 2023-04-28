import java.util.List;

public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        Integer Right = 0;
        Integer Left = 0;

        for(int i = 0; i < arr.size(); i ++) {
            Right += arr.get(i).get(i);
            Left += arr.get(i).get(arr.size() - 1 - i);
        }
        return Math.abs(Right - Left);
    }
}
