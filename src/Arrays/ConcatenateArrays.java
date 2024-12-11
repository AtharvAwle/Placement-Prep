package Arrays;

public class ConcatenateArrays {
    //leetcode 1929
    public static void main(String[] args) {

    }

    //create a array of twice the size of original array
    //keep two pointers 1-start index
    //                  2-n+i of original array
    //for loop fill first and second pointer together

    class Solution {
        public int[] getConcatenation(int[] nums) {
            int[] ans = new int[2*nums.length];

            for(int i = 0 ; i < nums.length ; i++){
                ans[i]=nums[i];
                ans[i+nums.length] = nums[i];
            }
            return ans;
        }
    }
}
