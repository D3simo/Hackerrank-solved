// The first kangaroo starts at location x1 and moves at a rate of v1 meters per jump.
// The second kangaroo starts at location x2 and moves at a rate of v2 meters per jump.

public class NumberLineJumps {
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        String result = "NO";
        ;;
        
        while(x1 < x2) {
            x1 += v1;
            x2 += v2;
            if(x1 == x2) {
                result = "YES";
                return result;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        kangaroo(14, 4, 98, 2);
    }
}
