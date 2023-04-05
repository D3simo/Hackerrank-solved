public class Chocolate_feast {
    public static int chocolateFeast(int n, int c, int m) {
        // Write your code here
        int chocolates = (n / c) % 10;
        int wrapper = chocolates;
        while(wrapper >= m) {
            int newBar = wrapper / m;
            chocolates += newBar;

            wrapper = wrapper - (newBar * m);
            wrapper += newBar;
        }
        return chocolates;
    }

    public static void main(String[] args) {
        chocolateFeast(6, 2, 2);
    }
}
