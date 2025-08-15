public class Varsha_Day1 {
    public static void sorting(int [] array) {
        int low = 0;
        int mid = 0;
        int high  = array.length-1;
        while(mid <= high) {
            if(array[mid] == 0) {
                int temp = array[low];
                array[low] = array[mid];
                array[mid] = temp;
                low++;
                mid++;
            }
            else if(array[mid] == 1) {
                mid++;
            }
            else {
                int temp = array[mid];
                array[mid] = array[high];
                array[high] = temp;
                high--;
            }
        }
    }
    public static void main(String [] args) {
        int [] arr = {0, 1, 2, 1, 0, 2, 1, 0};
        sorting(arr);
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}