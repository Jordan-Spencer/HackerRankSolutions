/* Given a string, S, of length N that is indexed from 0 to N-1, print its
even-indexed and odd-indexed characters as  space-separated strings on a
single line */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();;
    for (int i = 0; i<num; i++) {
        String input = scan.next();
        for (int j = 0; j<input.length(); j++) {
            if (j % 2 == 0) {
                System.out.print(input.charAt(j));
            }
        }
        System.out.print(" ");
        for (int k = 0; k<input.length(); k++) {
            if (k % 2 != 0) {
                System.out.print(input.charAt(k));
            }
        }
        System.out.println();
    }
    }
}
