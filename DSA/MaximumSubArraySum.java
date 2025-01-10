package DSA;
public class MaximumSubArraySum{
    static int maxLen(int[]  input){
        // given a list input
        // Get the max sum of any part of the array
        // Time Complexity--> o(n)

        // Intuition
        // """
        // Create two variables
        // currentSum :- Stores sum of array
        // maxSum :- Keeps track of the maxSum
        // """ 
        int currentSum = input[0];
        int maxSum = input[0];
        // starting at the same place with the same sum
        // looping the elements of the list
        for (int i = 1; i < input.length; i++){
            currentSum = Math.max(input[i], currentSum + input[i]);
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }
    public static void main(String[] args){
        int[] input={-2,1,-3,4,-1,2,1,-5,4};
        int result=maxLen(input);
        System.out.println(result);
    }
}