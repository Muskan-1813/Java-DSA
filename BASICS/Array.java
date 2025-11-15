import java.util.*;

public class Array {

    // Increases each element of the marks array by +1
    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] += 1;
        }
    }

    // Linear Search → checks each element one-by-one
    public static int linearSearch(int numbers[], int snum) {
        for (int idx = 0; idx < numbers.length; idx++) {
            if (numbers[idx] == snum) {
                return idx; // return index if found
            }
        }
        return -1; // return -1 if not found
    }

    // Find the largest element in the array
    public static void findMax(int numbers[]) {
        int largest = numbers[0];
        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] > largest) {
                largest = numbers[j];
            }
        }
        System.out.println("Largest number is : " + largest);
    }

    // Binary Search → works only on sorted arrays
    public static int binSearch(int sortnum[], int key) {
        int left = 0;
        int right = sortnum.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (sortnum[mid] == key) {
                return mid; // key found
            }

            if (sortnum[mid] > key) {
                right = mid - 1; // search left half
            } else {
                left = mid + 1; // search right half
            }
        }
        return -1; // not found
    }

    // Reverse the array in-place
    public static void reverse(int sortnum[]) {
        int left = 0;
        int right = sortnum.length - 1;

        while (left < right) {
            int temp = sortnum[left];
            sortnum[left] = sortnum[right];
            sortnum[right] = temp;

            left++;
            right--;
        }
    }

    // Print all pairs in the array
    public static void printPairs(int numbers[]) {
        int tp = 0;

        for (int idx = 0; idx < numbers.length; idx++) {
            int curr = numbers[idx];

            for (int j = idx + 1; j < numbers.length; j++) {
                System.out.print("(" + curr + ", " + numbers[j] + ") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total no of pairs: " + tp);
    }

    // Print all subarrays (correct version)
    public static void printSubarr(int numbers[]) {
        for (int start = 0; start < numbers.length; start++) {
            for (int end = start; end < numbers.length; end++) {

                // Print subarray from start → end (inclusive)
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int marks[] = new int[3];
        int numbers[] = {1, 2, 3, 67, 45, 0, 85, 34, 91, 23};
        int sortnum[] = {2, 4, 6, 8, 10, 12, 14, 16, 18};
        String fruits[] = {"Apple", "Banana", "Grapes"};

        Scanner sc = new Scanner(System.in);

        // Taking marks input
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        // Print marks
        System.out.println("Physics: " + marks[0]);
        System.out.println("Chemistry: " + marks[1]);
        System.out.println("Maths: " + marks[2]);

        // Calculate percentage
        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("Percentage is : " + percentage + "%");

        // Print array length
        System.out.println("Length is : " + marks.length);

        // Update marks by +1
        update(marks);

        // Print updated marks
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        // Linear Search for 85
        int res = linearSearch(numbers, 85);
        if (res == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + res);
        }

        // Find maximum value
        findMax(numbers);

        // Binary search for 12
        int find = binSearch(sortnum, 12);
        if (find == -1) {
            System.out.println("Element not found!!");
        } else {
            System.out.println("Element found at index " + find);
        }

        // Reverse and print array
        reverse(sortnum);
        for (int j = 0; j < sortnum.length; j++) {
            System.out.print(sortnum[j] + " ");
        }
        System.out.println();

        // Print all pairs
        printPairs(numbers);

        // Print all subarrays
        printSubarr(numbers);
    }
}
