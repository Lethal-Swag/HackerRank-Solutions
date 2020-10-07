import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        double size2 = scan.nextDouble();
        scan.nextLine();
        String str = scan.nextLine();

        System.out.println(size+i);
        System.out.println(size2 + d);
        System.out.println(s+str);
        
        scan.close();
    }
}