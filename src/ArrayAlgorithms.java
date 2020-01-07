public class ArrayAlgorithms {

    public static void main(String[] args){
        int[] list1 = {-2 , -9 , -6 , -8 , -9 , -3 , -1};
    }

    public static String printArray(int[] nums){
        String RS = "";

        for(int a:nums)
            RS += a + " ";

        return RS;
    }

    public static boolean checkForAllNegatives(int[] list){
        boolean str = true;
        for(int a:list){
            if(a >= 0){
                str = false;
            }
        }
        return str;
    }

    public static boolean hasDupes(int[] list){
        boolean str = false;

        for(int a = 0; a < list.length; a++){
            int intN = list[a];

            for(int b = list.length - 1; b >= 0; b--){

                if(intN == list[b] && a != b)
                    str = true;
            }
        }
        return str;
    }

    public static int countEvens(int[] arr){
        int even = 0;

        for(int a:arr){
            if(a % 2 == 0)
                even++;
        }

        return even;
    }

    public static int[] leftShift(int[] ns, int shift){
        int[] num = new int[shift + ns.length];

        for(int a = 0; a < num.length; a++){

            if(a <= ns.length-1) {
                num[a] = ns[a];
            }else{
                num[a] = 0;
            }
        }
        return num;
    }

    public static String reverseArray(int[] arr){
        for(int a = 0; a < arr.length / 2; a++){
            int one = arr[a];
            int two = arr[arr.length - 1 - a];

            arr[a] = two;
            arr[arr.length - 1 - a] = one;
        }

        return printArray(arr);
    }
}