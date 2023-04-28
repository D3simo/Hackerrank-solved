class Result {
    public static String timeInWords(int h, int m) {
        String minOutput;
        String finalOutput = "";
        int Hposition = h - 1;
        int Mposition = m % 10 - 1;
        int position = m - 1;
        String[] hours = new String[] {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven" , "twelve"};  
        String[] Hmin = new String[] {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven" , "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};  
        if (m < 15 && m > 0 && m != 1) {
            minOutput = Hmin[position] + " " + "minutes" + " " + "past";
            finalOutput = minOutput + " " + hours[Hposition];
        } else if (m == 15) {
            minOutput = "quarter past";
            finalOutput = minOutput + " " + hours[Hposition];
        } else if (m > 15 && m < 20) {
            minOutput = Hmin[position] + " " + "minutes" + " " + "past";
            finalOutput = minOutput + " " + hours[Hposition];
        } else if (m > 20 && m < 30) {
            minOutput = "twenty" + " " + Hmin[Mposition] + " " + "minutes" + " " + "past";
            finalOutput = minOutput + " " + hours[Hposition];
        } else if (m == 30) {
            minOutput = "half" + " " + "past";
            finalOutput = minOutput + " " + hours[Hposition];
        } else if (m > 30 && m < 40) {
            minOutput = "twenty" + " " + Hmin[40 - m - 1] + " " + "minutes" + " " + "to";
            finalOutput = minOutput + " " + hours[Hposition + 1];
        } else if (m > 40 && m < 45) {
            minOutput = Hmin[60 - m - 1] + " " + "minutes" + " " + "to";
            finalOutput = minOutput + " " + hours[Hposition + 1];
        } else if (m == 45) {
            minOutput = "quarter" + " " + "to";
            finalOutput = minOutput + " " + hours[Hposition + 1];
        } else if (m > 45) {
            minOutput = Hmin[60 - m - 1] + " " + "minutes" + " " + "to";
            finalOutput = minOutput + " " + hours[Hposition + 1];
        } else if (m == 0){
            minOutput = "o' clock";
            finalOutput = hours[Hposition] + " " + minOutput;
        } else if (m == 1) {
            minOutput = "one minute past";
            finalOutput = minOutput + " " + hours[Hposition];
        }
        return finalOutput;
    }
}
