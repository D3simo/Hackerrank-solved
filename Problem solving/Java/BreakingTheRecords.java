import java.net.SocketPermission;
import java.util.ArrayList;
import java.util.List;

public class BreakingTheRecords {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        Integer max = scores.get(0);
        Integer max_counter = 0;
        Integer min = scores.get(0);
        Integer min_counter = 0;
        ArrayList<Integer> tab = new ArrayList<>();
        for(int i = 1; i < scores.size(); i ++) {
            if(scores.get(i) > max) {
                max = scores.get(i);
                max_counter ++;
            }
            if(scores.get(i) < min) {
                min = scores.get(i);
                min_counter ++;
            }
        }
        tab.add(max_counter);
        tab.add(min_counter);
        return tab;
    }
}
 