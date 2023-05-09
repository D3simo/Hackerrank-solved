import java.util.Collections;
import java.util.List;

public class HurdleRace {
    public static int hurdleRace(int k, List<Integer> height) {
        Collections.sort(height);
        int doses = height.get(height.size() - 1);
        int result = doses - k;
        if(result < 0) {
            return 0;
        } else {
            return result;
        }
    }
}
