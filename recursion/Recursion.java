
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
     * Big - O Analysis: O(n) because the number of times we call 
     * countCannonballs is n times for the height
     * pre: height > 0 
     * post: counts number of cannonballs in a square pyramid given the height
     */
    public static int countCannonballs(int height) {
	assert (height > 0):
	height + " is out of bounds (not a postive integer)";

	if (height == 1){
	    return height;
	} else {
	    return (countCannonballs(height -1)) + height*height;
	}
    }


    /*****  2  ***************************************************/

    /*
     * Big - O Analysis: O(n) because we call isPalindrome n times
     * pre: str.length >= 1 and assume no spaces
     * post: checks is the given string is a palindrome, returns true or false
     */
    public static boolean isPalindrome(String str) {
	assert (str.length() >= 1):
	str.length() + "is out of bounds (not a positive integer)";

	if (str.length() == 1){
	    return true;
	} else if (str.charAt(0) == str.charAt(str.length()-1)){
	    return isPalindrome(str.substring(1, str.length()-1));
	} else {
	    return false;
	}
    }

    /*****  3  ***************************************************/

    /*
     * Big - O Analysis: O(n) because we call isBalanced n times
     * pre: the string str contains only parens, brackets, and braces
     * post: Returns true if str is a string of matched parens, brackets and
     * braces
     */
    public static boolean isBalanced(String str) {
	if(str.equals("")){
	    return true;
	} else if(str.contains("()")){ 
	    return isBalanced(str.replace("()", ""));
	} else if(str.contains("[]")){
	    return isBalanced(str.replace("[]", ""));
	} else if(str.contains("{}")){
	    return isBalanced(str.replace("{}", ""));
	}
	return false;
    }


    /*****  4  ***************************************************/

    /*
     * Big - O Analysis: O(2^n) because each time we call the helper, the 
     * the number of things being done is exponentially increasing
     * Description: Print all substrings of str.  (Order does not matter.)
     */
    public static void printSubstrings(String str) {
	substringHelper(str, "");
}
    public static void substringHelper(String str, String soFar) {
	    if (str.equals("")){
		System.out.println(soFar);
	    } else {
		String subStr = str.substring(1, str.length());
		substringHelper(subStr, soFar + (str.charAt(0)));
		substringHelper(subStr, soFar);
	    }
    }

    /*****  5  ***************************************************/

    /*
     * Big - O Analysis: O(n) because we call the recursive call n times
     * pre: number >= 0 (nonnegative)
     * post: prints a given base ten number in binary
     */
    public static void printInBinary(int number) {
	assert (number >= 0):
	number + " is out of bounds (negative)";

	if (number == 0 || number == 1){
	    System.out.print(number);
	} else {
	    printInBinary(number / 2);
	    System.out.print(number % 2);
	}
    }


    /*****  6  ***************************************************/

    /*
     * Big-O Analysis: O(2^n) because the recursive call is made on an 
     * exponentially increasing basis as we move through the array "nums"
     * Description: Return whether a subset of the numbers in nums add up to
     * sum and print them out
     */
    public static boolean printSubSetSum(int nums[], 
					 int targetSum) {
	if (nums.length == 0){
	    return false;
	}else {
	    return canMakeSum(nums, targetSum, 0);
	}
    }

    /*
     * pre: nums.length > 0
     * post: check if two nummbers in num add up to target sum by choosing one
     * and decrementing target sum or not choosing that number and moving to
     * the next number in the set
     */
    public static boolean canMakeSum( int nums [], int targetSum, int index){
	assert (nums.length > 0):
	nums.length + " is out of bounds (does not contain any elements)";

	if (index == nums.length){
	    return targetSum ==0;
	} else { // if nums.length > 0 
	    return canMakeSum(nums, targetSum - nums[index], index +
			      1) || canMakeSum(nums, targetSum, index + 1);  
	}
    }


    /*
     * Big - O Analysis: same as printSubSetSum - O(2^n) for same reason
     * Description: Return the number of different ways elements in nums can be
     * add together to equal target sum
     */
    public static int countSubSetSumSolutions(int nums[], 
					      int targetSum) {
	if (nums.length == 0){
	    return 0;
	} else {
	    return numSums(nums, targetSum, 0);
	}
    }

    /*
     * pre: nums.length > 0
     * post: counts the number of possible subsets will create the target sum
     */
    public static int numSums( int nums [], int targetSum, int index){
        assert (nums.length > 0):
	nums.length + " is out of bounds (does not contain any elements)";

	if (index == nums.length){
            if(targetSum==0){
		return 1;
	    }
        } else { // if nums.length > 0                                         
            return numSums(nums, targetSum - nums[index], index +
                              1) + numSums(nums, targetSum, index + 1);
        }
	return 0;
    }




    /**************************************************************/

    
    /*
     * Add testing code to main to demonstrate that each of your 
     * recursive methods works properly.
     */
    public static void main(String args[]) {

	// test code for problem 1
	//System.out.println(countCannonballs(3));
	//System.out.println(countCannonballs(10));
	
	// test code for problem 2
	//System.out.println(isPalindrome("racecar"));
	//System.out.println(isPalindrome("julia"));

	// test code for problem 3
	//System.out.println(isBalanced("{[()[()]]}"));
	//System.out.println(isBalanced("{}["));
		
	// test code for problem 4
	//printSubstrings("ABC");
    
	// test code for problem 5
	//printInBinary(11);
	//System.out.println();

	// test code for problem 6
	//System.out.println(printSubSetSum(new int[] {5, 4, 1, 8, 2}, 6));
	//System.out.println(countSubSetSumSolutions(new int[]{5,4,1,2}, 6));
    }

}
