import java.util.*;

class Result {

    /*
     * Complete the 'fairRations' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER_ARRAY B as parameter.
     */

    public static String fairRations(List<Integer> B) {
    int result = 0;
    
    for (int i = 0; i < B.size() ; i++){
        if (B.get(i)%2 != 0){
            if (i == B.size()-1) return "NO";
            B.set(i, B.get(i)+1);
            B.set(i+1, B.get(i+1)+1);
            result += 2;
        }
    }
    return Integer.toString(result);        
    }
}
