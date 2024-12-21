package A2Z;

public class ArraysEasy {
    public static void main(String[] args) {
        
    }

    // 1- Largest element in array
    public static int largest(int[] arr) {
        // code here
        int max = Integer.MIN_VALUE;
        
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    // 2- Second largest element in array without sorting

    public int getSecondLargest(int[] arr) {
        // Code Here
       int large = arr[0];
       int slarge = Integer.MIN_VALUE;
       
       for(int i = 1 ; i < arr.length ; i++){
           if(arr[i] > large){
               slarge = large;
               large = arr[i];
           }
           else if(arr[i] > slarge && arr[i] < large){
               slarge = arr[i];
           }
       }
    //   edge case
       if(slarge == Integer.MIN_VALUE){
           return -1;
       }
       return slarge;
    }


    // 3 - check if array is sorted

    public boolean arraySortedOrNot(int[] arr) {
        // code here
        int i = 0;
        
        for(int j = 1 ; j < arr.length ; j++){
            if(arr[j] < arr[i]){
                return false;
            }else {
                i++;
            }
        }
        return true;
    } 
}
