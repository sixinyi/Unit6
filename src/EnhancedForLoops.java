// Bruce 12/18 3 same program for test program
public class EnhancedForLoops {
    public static String printStandardFor(String[] arr){

        String RS = "";

        for(int n = 0; n < arr.length; n++)
            RS += arr[n] + " ";
        return RS;
    }
    public static String printStandardFor(int[] arr){

        String RS = "";

        for(int n = 0; n < arr.length; n++)
            RS += arr[n] + " ";
        return RS;
    }
    public static String printStandardFor(double[] arr){

        String RS = "";

        for(int n = 0; n < arr.length; n++)
            RS += arr[n] + " ";
        return RS;
    }
    public static String printEnhancedFor(String[] arr){

        String RS = "";

        for(String x:arr){
            RS += x + " ";
        }
        return RS;
    }
    public static String printEnhancedFor(int[] arr){

        String RS = "";

        for(int x:arr){
            RS += x + " ";
        }
        return RS;
    }
    public static String printEnhancedFor(double[] arr){

        String RS = "";

        for(double x:arr){
            RS += x + " ";
        }
        return RS;
    }
    public static String printStandardWhile(String[] arr){

        int n = 0;
        String RS = "";

        while(n < arr.length) {
            RS += arr[n] + " ";
            n++;
        }
        return RS;
    }
    public static String printStandardWhile(int[] arr){

        int n = 0;
        String RS = "";

        while(n < arr.length) {
            RS += arr[n] + " ";
            n++;
        }
        return RS;
    }
    public static String printStandardWhile(double[] arr){

        int n = 0;
        String RS = "";

        while(n < arr.length) {
            RS += arr[n] + " ";
            n++;
        }
        return RS;
    }
}