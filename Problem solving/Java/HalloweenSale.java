class HalloweenSale {
    public static int howManyGames(int p, int d, int m, int s) {
        int counter = 0;
        while (s >= p && s >= m) {
            if(p > m) {
                s -= p;
                p -= d;
                counter ++;
            } else {
                s -= m;
                counter ++;
            }
        }
        return counter;
    }
}
