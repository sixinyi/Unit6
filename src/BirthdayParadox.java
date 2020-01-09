/* Bruce 2020/1/8
The program found opportunities for 23 people to meet someone with the same birthday.
Create 1000 examples to find a percentage, Randomly generate a date, Then check to see if the same date exists in the random number group.
Finally, the count is converted to a percentage and displayed to the user*/


public class BirthdayParadox {

    public static void main(String[] args){
        double match = 0.0;
        for(int a = 0; a < 1000; a++){
            int[] birthday  = dates(23);
            if(hasDupes(birthday))
                match++;
        }
        match *= 100;
        match /= 1000;
        System.out.print("The percent of times there were duplicate birthdays is " + match + "%.");
    }

    public static boolean hasDupes(int[] birth){
        boolean str = false;
        for(int a = 0; a < birth.length; a++){
            int intN = birth[a];
            for(int b = birth.length - 1; b >= 0; b--){
                if(intN == birth[b] && a != b)
                    str = true;
            }
        }
        return str;
    }

    public static int[] dates(int num){
        int[] birthday = new int[num];
        for(int a = 0; a < birthday.length; a++)
            birthday[a] = (int)(Math.random() * 365);
        return birthday;
    }





}