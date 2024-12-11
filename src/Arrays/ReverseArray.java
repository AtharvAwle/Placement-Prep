package Arrays;

public class ReverseArray {
    public static void main(String[] args) {

    }

    //Take two pointers 1- start of array
    //                  2- end of array
    //swap start and end till start < end
    //start++  & end--

    class Solution {
        public void reverseArray(int arr[]) {
            // code here
            int start = 0;
            int end = arr.length-1;
            //swap karneka
            while(start <= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }

        }
    }
}
