import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Service_lane {
    public static List<Integer> serviceLane(List<Integer> width, List<List<Integer>> cases) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < cases.size(); i++) {
            result.add(Collections.min(width.subList(cases.get(i).get(0), cases.get(i).get(1)+1))); 
        }
        return result;
    }
}