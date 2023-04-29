import java.util.List;

class SalesByMatch {
    public static int sockMerchant(int n, List<Integer> ar) {
        
        int arr[] = new int[110];
        for(int i=0; i< ar.size(); i++) {
            arr[ar.get(i)] ++;
        }
        int ans = 0;
        for(int i: arr) {
            if(i != 0) {
                ans += i/2;
            }
        }
        return ans;
    }
}
