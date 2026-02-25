import java.util.Arrays;

public class q1 {

    // Function to find two indices such that numbers[index1] + numbers[index2] = target
    public static int[] twoSum(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {

            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1}; // 1-indexed
            }
            else if (sum < target) {
                left++;
            }
            else {
                right--;
            }
        }

        return new int[]{-1, -1}; // never reached (exactly one solution exists)
    }

    public static void main(String[] args) {

        // 🔹 Test Case 1
        int[] arr1 = {2, 7, 11, 15};
        int target1 = 9;
        System.out.println("Test Case 1:");
        System.out.println(Arrays.toString(twoSum(arr1, target1)));

        // 🔹 Test Case 2
        int[] arr2 = {1, 2, 3, 4, 4, 9};
        int target2 = 8;
        System.out.println("Test Case 2:");
        System.out.println(Arrays.toString(twoSum(arr2, target2)));

        // 🔹 Test Case 3
        int[] arr3 = {-3, 0, 2, 5, 9};
        int target3 = 6;
        System.out.println("Test Case 3:");
        System.out.println(Arrays.toString(twoSum(arr3, target3)));

        // 🔹 Test Case 4
        int[] arr4 = {1, 3, 5, 6, 8, 12};
        int target4 = 14;
        System.out.println("Test Case 4:");
        System.out.println(Arrays.toString(twoSum(arr4, target4)));
    }
}