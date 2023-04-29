class FindDigits {
    public static int findDigits(int n) {
        // Write your code here
        int temp = n, count = 0;
        while(temp>0) {
            int digit = temp%10;
            if (digit!=0 && n%digit==0) count++;
            temp/=10;
        }
        return count;
    }
}