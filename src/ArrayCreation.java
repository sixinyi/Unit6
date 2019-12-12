// Bruce  12.9  This program is for getAverage, stringArray, countryData
public class ArrayCreation {
    public static void main(String[] args){ }

    public static double getAverage(double[] num){
        if(num.length < 3)
            return 0.0;
        else{

            double n1 = num[0];
            double n2 = num[num.length / 2];
            double n3 = num[num.length - 1];

            double average = n1 + n2 + n3;
            average /= 3;

            return average;
        }
    }
    public static String stringArray(String[] friends){
        String lengthStr = "";
        int lengthNxt;
        if(friends.length != 5)
            return "";
        else {
            for (int num = 0; num < 5; num ++) {
                lengthNxt = friends[num].length();
                lengthStr += String.valueOf(lengthNxt) + " ";
            }

            return lengthStr;
        }
    }
    public static String countryData(){
        int rindex = (int)(Math.random() * 13);

        String[] countries = {"China", "Egypt", "France", "South Korea", "Germany", "India", "Japan", "Ghana", "Kenya",
                "Mexico", "United Kingdom", "Burkina Faso", "United States"};

        String[] capitals = {"Beijing", "Cairo", "Paris", "Seoul", "Berlin", "New Delhi", "Tokyo", "Accra", "Nairobi",
                "Mexico City", "London", "Ouagadougou", "Washington D.C."};

        String[] languages = {"Mandarin", "Arabic", "French", "Korean", "German", "Hindi", "Japanese", "Akuapem Twi",
                "Swahili", "Spanish", "English", "French", "English"};

        return "The capital of " + countries[rindex] + " is " + capitals[rindex] + " and the primary language"
                + " is " + languages[rindex];
    }

}