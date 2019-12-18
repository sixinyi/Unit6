// Bruce 12/18 TraverseArrays
public class TraverseArrays {
    public static void main(String[] args){

    }
    public static int countEven(int[] nums){

        int evenAmount = 0;

        for(int n = 0; n < nums.length; n++){
            if(nums[n] % 2 == 0)
                evenAmount++;
        }
        return evenAmount;
    }
    public static int[] buildArray(int desiredLength){

        int[] createdArray = new int[desiredLength];

        for(int n = 0; n < createdArray.length; n++)
            createdArray[n] = n;
        return createdArray;
    }
    public static boolean sum28(int[] numbers){

        int total2 = 0;

        for(int n = 0; n < numbers.length; n++){
            if(numbers[n] == 2)
                total2 += 2;
        }
        return total2 == 8;
    }
    public static int[] zeroMax(int[] original){

        for(int n = 1; n < original.length; n += 2){
            if(original[n] % 2 != 0)
                original[n - 1] = original[n];
        }
        return original;
    }



}