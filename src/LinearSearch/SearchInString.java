package LinearSearch;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Atharv";
        char target = 'v';

        System.out.println(stringSearch(name,target));

    }

    static boolean stringSearch(String str , char target){
        if (str.length() == 0){
            return false;
        }

        for (int i=0;i<str.length();i++){
            if (str.charAt(i) == target){
                return true;
            }
        }
        return false;
    }
}
