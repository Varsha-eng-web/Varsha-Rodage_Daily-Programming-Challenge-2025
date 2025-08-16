import java.util.Scanner;
public class Varsha_Day2 {
    public static int find_missing_number(int [] array) {
        int n = array.length+1;
        int arrSum = 0;
        int total_Sum = n * (n + 1) / 2;
        for(int num : array) { 
            arrSum += num;
        }
        return (int) (total_Sum - arrSum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter n(range) : ");
        int n = sc.nextInt();

        int [] arr = new int [n];
          System.out.println("Enter " + (n) + " Numbers : ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Missing Number is : " + find_missing_number(arr));
        sc.close();
    }
}
