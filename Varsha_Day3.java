public class Varsha_Day3 {
    public static int findDuplicate(int [] array) {
        int slow = array[0];
        int fast = array[0];

        do{
            slow = array [slow];
            fast = array[array[fast]];
        } while (slow != fast);
        slow = array[0];

        while(slow != fast){
            slow = array[slow];
            fast = array[fast];
        }
        return slow;
    }
    public static void main(String[] args) {
        int [] arr1 = {1, 3, 4, 2, 2};
        int [] arr2 = {3, 1, 3, 4, 2};
        int [] arr3 = {1, 1};
        int [] arr4 = {1, 4, 4, 2, 3};
        System.out.println("Duplicate Number is : " + findDuplicate(arr1));
        System.out.println("Duplicate Number is : " + findDuplicate(arr2));
        System.out.println("Duplicate Number is : " + findDuplicate(arr3));
        System.out.println("Duplicate Number is : " + findDuplicate(arr4));
    }
}
