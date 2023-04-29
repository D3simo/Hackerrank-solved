import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PickingNumbers {
    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
            Collections.sort(a);
            int max = 0;
        
            for(int i = 0; i < a.size(); i++) {
                int count = 0;
                for(int j = i; j < a.size()-1; j++) {
                    if((a.get(j+1) - a.get(i)) <= 1) {
                        count++;
                        if(count > max) {
                            max = count;
                        }
                    }
                }
            }
            return max + 1;
        }
}