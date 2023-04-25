import java.util.List;

public class ApplesAndOranges {
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        Integer app = 0;
        Integer orange = 0;
        for(int i = 0; i < apples.size(); i ++) {
            if((apples.get(i) + a >= s) && (t >= apples.get(i) + a)) {
                app ++;
            }
        }
        for(int i = 0; i < oranges.size(); i ++) {
            if((oranges.get(i) + b >= s) && (t >= oranges.get(i) + b)) {
                orange ++;
            }
        }
        System.out.println(app);
        System.out.println(orange);
    }
}
