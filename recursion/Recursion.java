/*
 * Recursion.java
 *
 * Name: Julia Mini
 *
 * Lab: Thursday 1 - 4
 *
 * Starter code for the recursion lab.
 *
 */
import structure5.*;

public class Recursion {


    /*****  1  ***************************************************/

    /*
     * Return number of cannoballs in pyramid with the given height.
     */
    public static int countCannonballs(int height) {
	if (height == 1){
	    return height;
	} else{
	    // return Math.exp(countCannonballs(height -1)) + height;
	}
	return -1;
    }


    /*****  2  ***************************************************/

    /*
     * Return true if str is a palindrome.
     */
    public static boolean isPalindrome(String str) {
	if (str.length() == 1){
	    return true;
	} else {
	    if (str.charAt(0) == str.charAt(-1)){
		isPalindrome(str.substring(1,-1));
			 return true;
	    }
	}
	return false;
	System.out.println(isPalindrome("racecar"));
    }

    /*****  3  ***************************************************/

    /*
     * Return true if str is a string of matched parens,
     * brackets, and braces.
     */
    public static boolean isBalanced(String str) {
	return false;
    }


    /*****  4  ***************************************************/

    /*
     * Print all substrings of str.  (Order does not matter.)
     */
    public static void printSubstrings(String str) {

    }

    /*****  5  ***************************************************/

    /*
     * Print number in binary
     */
    public static void printInBinary(int number) {

    }


    /*****  6  ***************************************************/

    /*
     * Return whether a subset of the numbers in nums add up to sum,
     * and print them out.
     */
    public static boolean printSubSetSum(int nums[], 
					 int targetSum) {
	return false;
    }


    /*
     * Return the number of different ways elements in nums can be
     * added together to equal sum.
     */
    public static int countSubSetSumSolutions(int nums[], 
					      int targetSum) {
	return 0;
    }



    /*****  7  ***************************************************/
    
    public static void listCompletions(String digitSequence, 
				       Lexicon lex) {
    
    }


    /**************************************************************/
    
    /*
     * Add testing code to main to demonstrate that each of your 
     * recursive methods works properly.
     */
    public static void main(String args[]) {

	// test code for problem 1
	System.out.println(countCannonballs(3));
	System.out.println(countCannonballs(10));
    }
}
