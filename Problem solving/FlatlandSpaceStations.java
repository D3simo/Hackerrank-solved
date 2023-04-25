import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlatlandSpaceStations {
    static int flatlandSpaceStations(int n, int[] c) {
        List<Integer> distance=new ArrayList<>();
        // ! every map contains space station
        if(c.length == n) { 
            return 0;
        } else {
            for(int i = 0; i < n; i ++) {
                int minDistance = Math.abs(c[0] - i);
                for(int j = 1; j < c.length; j ++) {
                    minDistance = Math.min(Math.abs(c[j] - i), minDistance);
                }
            distance.add(minDistance);
            }
        }
        return Collections.max(distance);
    }
}
