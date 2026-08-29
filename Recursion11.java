// Function to find the minimum number in an array
public static int Recursion11(int[] numbers, int startIndex, int endIndex) {
    // If size = 0 means whole array has been traversed
    if (startIndex == endIndex) {
        return numbers[startIndex]; // stopping condition
    }
    
    return Math.min(numbers[endIndex], findMin(numbers, startIndex, endIndex - 1));
}