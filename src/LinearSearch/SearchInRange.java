package LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int arr[] = {12,324,543,654,65};
        int target = 324;
        //suppose range is [0,3(exclusive hai yeh)]

        int start = 0;
        int end = 3;

        for (int i = start ; i < end ; i++){
            if (arr[i] == target){
                System.out.println(i);
            }
        }
    }
}
