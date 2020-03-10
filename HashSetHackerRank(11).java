/* Problem 11 #100ProblemSolvingChallenge

Problem Link: https://www.hackerrank.com/challenges/java-hashset/copy-from/146697042

In computer science, a set is an abstract data type that can store certain values, without any particular order, and no repeated values(Wikipedia).  is an example of a set, but  is not a set. Today you will learn how to use sets in java by solving this problem.

You are given  pairs of strings. Two pairs  and  are identical if  and . That also implies  is not same as . After taking each pair as input, you need to print number of unique pairs you currently have.

Complete the code in the editor to solve this problem.

Input Format

In the first line, there will be an integer  denoting number of pairs. Each of the next  lines will contain two strings seperated by a single space.

Constraints:

Length of each string is atmost  and will consist lower case letters only.
Output Format

Print  lines. In the  line, print number of unique pairs you have after taking  pair as input.

Sample Input

5
john tom
john mary
john tom
mary anna
mary anna
Sample Output

1
2
2
3
3
Explanation

After taking the first input, you have only one pair: (john,tom)
After taking the second input, you have two pairs: (john, tom) and (john, mary)
After taking the third input, you still have two unique pairs.
After taking the fourth input, you have three unique pairs: (john,tom), (john, mary) and (mary, anna)
After taking the fifth input, you still have three unique pairs. */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HashSetHackerRank{

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next(); // We have taken String value from the user
            pair_right[i] = s.next();
        }
        HashSet<String> hset = new HashSet<String>();
        for (int j = 0; j < t; j++) {
            hset.add(pair_left[j] +" "+ pair_right[j]); //then we just add them inside hashset both of the String with a Space
            
            System.out.println(hset.size()); /* now every time we print the size how many pairs existed now after updating the pairs.
			and as hash set don't count duplicate value it makes the problem solved easy. */
        }
   }
}