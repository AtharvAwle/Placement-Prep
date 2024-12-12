package LinearSearch;

public class Code {
    public static void main(String[] args) {
        //code for linear search;
        int[] arr = {1,2,3,4,5,67,8,8};
        int key = 67;

        System.out.println(linear(arr,key));

    }

    static int linear(int[] arr , int key){
        if (arr.length == 0){
            return -1;
        }
        for (int i=0 ; i< arr.length ; i++){
            if (arr[i] == key){
                return i;
            }
        }
        return -1;
    }
}
