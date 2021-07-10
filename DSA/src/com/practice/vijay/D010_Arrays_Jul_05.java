package com.practice.vijay;

public class D010_Arrays_Jul_05 {

    /**
     * Question 1
     * Special Subsequences "AG"
     * Problem Description
     *
     * You have given a string A having Uppercase English letters.
     *
     * You have to find that how many times subsequence "AG" is there in the given string.
     *
     * NOTE: Return the answer modulo 109 + 7 as the answer can be very large.
     *
     *
     *
     * Problem Constraints
     * 1 <= length(A) <= 105
     *
     *
     *
     * Input Format
     * First and only argument is a string A.
     *
     *
     *
     * Output Format
     * Return an integer denoting the answer.
     *
     *
     *
     * Example Input
     * Input 1:
     *
     *  A = "ABCGAG"
     * Input 2:
     *
     *  A = "GAB"
     *
     *
     * Example Output
     * Output 1:
     *
     *  3
     * Output 2:
     *
     *  0
     *
     *
     * Example Explanation
     * Explanation 1:
     *
     *  Subsequence "AG" is 3 times in given string
     * Explanation 2:
     *
     *  There is no subsequence "AG" in the given string.
     *
     *
     *
     * ×
     * You only need to implement the given function. Do not read input, instead use the arguments to the function. Do not print the output, instead return values as specified. Still have a doubt? Checkout Sample Codes for more details.
     */
    public int countOfAG(String A) {
        char[] chars = A.toCharArray();
        int count = 0;
        int ans = 0;
        for(int i = (chars.length-1); i >= 0; i--) {
            if(chars[i] == 'G') {
                count++;
            }
            if(chars[i] == 'A') {
                ans += count;
            }
        }
        return ans;
    }

    /**
     * Question 3
     * Print a Pattern According to The Given Value of A.
     *
     * Example: For A = 3 pattern looks like:
     *
     *     1
     *   2 1
     * 3 2 1
     *
     * Problem Constraints
     * 1 <= A <= 1000
     *
     *
     * Input Format
     * First and only argument is an integer denoting A.
     *
     *
     *
     * Output Format
     * Return a two-dimensional array where each row in the returned array represents a row in the pattern.
     *
     *
     *
     * Example Input
     * Input 1:
     *
     *  A = 3
     * Input 2:
     *
     *  A = 4
     *
     *
     * Example Output
     * Output :1
     *
     *  [
     *    [0, 0, 1]
     *    [0, 2, 1]
     *    [3, 2, 1]
     *  ]
     * Output 2:
     *
     *  [
     *    [0, 0, 0, 1]
     *    [0, 0, 2, 1]
     *    [0, 3, 2, 1]
     *    [4, 3, 2, 1]
     *  ]
     *
     *
     * Example Explanation
     * Explanation 2:
     *
     *
     *  For A = 4 pattern looks like:
     *                                    1
     *                                  2 1
     *                                3 2 1
     *                              4 3 2 1
     *  So we will return it as two-dimensional array.
     *  Row 1 contains 3 spaces and 1 integer so spaces will be considered as 0 in the output.
     */
    public int[][] printPattern(int limit) {
        int[][] result = new int[limit][limit];

        for(int i = 0; i < limit; i++ ) {
            int num = 1;
            int count = 0;
            for(int j = limit-1; j >= 0; j--) {
                if(count <= i) {
                    count++;
                    result[i][j] = num++;
                }
                if(count > i) break;
            }
        }
        return result;
    }


}
