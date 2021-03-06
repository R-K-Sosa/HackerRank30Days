/*
Task 
Complete the code in the editor below. The variables i, d, and s are already declared and initialized for you. You must:

1) Declare 3 variables: one of type int, one of type double, and one of type String.
2) Read 3 lines of input from stdin (according to the sequence given in the Input Format section below) and initialize your 3 variables.
3) Use the + operator to perform the following operations: 
	1. Print the sum of i plus your int variable on a new line.
	2. Print the sum of d plus your double variable to a scale of one decimal place on a new line.
	3. Concatenate s with the string you read as input and print the result on a new line.

Input Format

The first line contains an integer that you must sum with . 
The second line contains a double that you must sum with . 
The third line contains a string that you must concatenate with .

Output Format

Print the sum of both integers on the first line, the sum of both doubles 
(scaled to  decimal place) on the second line, and then the two concatenated 
strings on the third line.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
	
	//Declare and initialize variables i, d, and s.    
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
	
	// Create a Scanner object to read input from stdin.
        Scanner scan = new Scanner(System.in);
        
        /* Declare second integer, double, and String variables. */
	
        int i1;
        double d1;
        String s1;

        /*Read and save an integer, double, and String to your variables.*/
        /*Here, scan is an object of scanner class; using that, you can scan value and take value from user*/
	
        i1=scan.nextInt(); 
        d1=scan.nextDouble();
        s1=scan.next();
	
        /*Concatenate String variables on a new line 
        by taking the previous with current value of s and adding them together.*/
	
        s1+=scan.nextLine();

        /* Print the sum of both integer variables on a new line. */
	
        System.out.println(i+i1);

        /* Print the sum of the double variables on a new line. */
	
	System.out.println(d+d1);

        /* Print the String variables on a new line; 
        	the 's' variable above should be printed first to create a logical sentence. */
		
        System.out.println(s+s1);
        
        scan.close();
    }
}

/*Congrats, you solved this challenge!
 Test Case #0
 Test Case #1
 Used Java 8 */

 