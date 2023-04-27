// The elements of the first array are all factors of the integer being considered
// The integer being considered is a factor of all elements of the second array

import java.util.List;

public class BetweenTwoSets {
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        a.sort(null);
        b.sort(null);
        Integer count = 0;
        for(int i = a.get(a.size() - 1); i <= b.get(0); i ++) {
            int sum = 0;
            for(int a_i = 0; a_i < a.size(); a_i ++) {
                sum += i % a.get(a_i);
            }
            for(int b_i = 0; b_i < b.size(); b_i ++) {
                sum += b.get(b_i) % i;
            }

            if(sum == 0) {
                ++ count;
            }
        }
        return count;
    }
}
