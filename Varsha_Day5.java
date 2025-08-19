import java.util.*;
public class Varsha_Day5 {
    public static List<Integer> findingLeaderElement(int []Array) {
        int n = Array.length;
        List<Integer> Leaders = new ArrayList<>();
        int MaxRight = Array[n-1];
        Leaders.add(MaxRight);

        for(int i=n-2; i>=0; i--) {
            if(Array[i] > MaxRight) {
                Leaders.add(Array[i]);
                MaxRight = Array[i];
            }
        }
        Collections.reverse(Leaders);
        return Leaders;
    }
    public static void main(String[] args) {
        int []arr1 = {1, 2, 3, 4, 0};
        int []arr2 = {7, 10, 4, 10, 6, 5, 2};
        int []arr3 = {5};
        int []arr4 = {100, 50, 20, 10};
        int []arr5 = {1, 2, 3, 1000000};

        System.out.println(findingLeaderElement(arr1));
        System.out.println(findingLeaderElement(arr2));
        System.out.println(findingLeaderElement(arr3));
        System.out.println(findingLeaderElement(arr4));
        System.out.println(findingLeaderElement(arr5));
    }
}
