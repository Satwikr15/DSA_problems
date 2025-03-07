class Main {
    public static int floor(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int ans = -1; // Initialize to -1 if floor doesn't exist

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                return arr[mid]; // Exact match
            } else if (arr[mid] < x) {
                ans = arr[mid]; // Possible floor
                low = mid + 1;  // Move to the right half
            } else {
                high = mid - 1; // Move to the left half
            }
        }
        return ans; // Correctly placed return statement
    }

    // Function to find the ceiling of x in arr[]
    public static int ceiling(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int ans = -1; // Initialize to -1 if ceiling doesn't exist

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                return arr[mid]; // Exact match
            } else if (arr[mid] < x) {
                low = mid + 1; // Move to the right half
            } else {
                ans = arr[mid]; // Possible ceiling
                high = mid - 1; // Move to the left half
            }
        }
        return ans; // Correctly placed return statement
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 7, 8, 10}; // Sorted array
        int x = 6;

        System.out.println("Floor: " + floor(arr, x));   // Expected Output: 4
        System.out.println("Ceiling: " + ceiling(arr, x)); // Expected Output: 7
    }
}
