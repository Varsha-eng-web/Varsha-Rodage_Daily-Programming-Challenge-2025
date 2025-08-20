import java.util.*;
public class Varsha_Day6 {
    public static List<int[]> findZeroSumSubarrays(int[] arr) {
        List<int[]> result = new ArrayList<>();
        Map<Long, List<Integer>> prefixMap = new HashMap<>();
        long prefixSum = 0;

        prefixMap.put(0L, new ArrayList<>(Arrays.asList(-1)));
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            if (prefixMap.containsKey(prefixSum)) {
                for (int startIndex : prefixMap.get(prefixSum)) {
                    result.add(new int[]{startIndex + 1, i});
                }
            }
            prefixMap.computeIfAbsent(prefixSum, k -> new ArrayList<>()).add(i);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, -3, 3, -1, 2};
        int[] arr2 = {4, -1, -3, 1, 2, -1};
        int[] arr3 = {0, 0, 0};
        int[] arr4 = {-3, 1, 2, -3, 4, 0};
        int[] arr5 = {1, 2, 3, 4};

        System.out.println("Input:" + Arrays.toString(arr1));
        print(findZeroSumSubarrays(arr1));

        System.out.println("Input: " + Arrays.toString(arr2));
        print(findZeroSumSubarrays(arr2));

        System.out.println("Input: " + Arrays.toString(arr3));
        print(findZeroSumSubarrays(arr3));

        System.out.println("Input: " + Arrays.toString(arr4));
        print(findZeroSumSubarrays(arr4));

        System.out.println("Input: " + Arrays.toString(arr5));
        print(findZeroSumSubarrays(arr5));
    }

    private static void print(List<int[]> subarrays) {
        List<String> res = new ArrayList<>();
        for (int[] p : subarrays) {
            res.add("(" + p[0] + ", " + p[1] + ")");
        }
        System.out.println("Output: " + res);
    }
}
