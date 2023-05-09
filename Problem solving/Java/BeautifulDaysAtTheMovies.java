
public class BeautifulDaysAtTheMovies {
    public static int beautifulDays(int i, int j, int k) {
        Integer counter = 0;
        for(int x = i; x <= j; x ++) {
            Double result = 0.0;
            String tempInt = String.valueOf(x);
            StringBuilder tempString = new StringBuilder();
            tempString.append(tempInt);
            tempString.reverse();
            String strBuilderToStr = tempString.toString();
            Double tempStringToInt = Double.valueOf(strBuilderToStr); // 02 -> 2
            result = (Math.abs(x - tempStringToInt)) / k;
            if(result % 1 == 0) {
                counter ++;
            }
        }
        return counter;
    }
}
