import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter random number: ");
        int num = keyboard.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rand = new Random();
        if (num > 0) {
            for (int i = 0; i < num; i++) {
                int random_number = rand.nextInt(num);
                numbers.add(random_number);
            }
        }
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();
        ArrayList<String> strArr = new ArrayList<>(List.of("Goodbye", "Hello", "Farewell", "Good Morning"));
        String found = returnString(strArr);
        System.out.println(found);
        ArrayList<Integer> nums = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        int target = 1;
        int foundBS = binarySearch(nums, target);
        System.out.println(foundBS);
        ArrayList<Integer> nums2 = new ArrayList<>(List.of(10, 9, 8, 7));
        bubbleSort(nums2);
        for (int i = 0; i < nums2.size(); i++) {
            System.out.println(nums2.get(i));
        }
        keyboard.close();
    }

    public static String returnString(ArrayList<String> strArr) {
        for (int i = 0; i < strArr.size(); i++) {
            String curr_str = strArr.get(i).toLowerCase();
            System.out.println(curr_str);
            if (curr_str.equals(curr_str)) {
                return "I found this string";
            }

        }
        return "This string does not exist in this array";
    }

    public static int binarySearch(ArrayList<Integer> nums, int target) {
        int left = 0, right = nums.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums.get(mid) == target) {
                return mid;
            }

            if (nums.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void bubbleSort(ArrayList<Integer> nums) {
        for (int pass = 0; pass < nums.size() - 1; pass++) {
            for (int i = 0; i < nums.size() - pass - 1; i++) {
                if (nums.get(i) > nums.get(i + 1)) {
                    int temp = nums.get(i + 1);
                    nums.set(i + 1, nums.get(i));
                    nums.set(i, temp);
                }
            }
        }
    }
}