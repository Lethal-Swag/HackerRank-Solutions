import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static void total(double mealCost,int tip,int tax){

        System.out.print((int)Math.round(mealCost + mealCost * tip/100 + mealCost * tax/100));
    }
    public static void main(String[] e){
        Scanner sc = new Scanner(System.in);
        double mealCost = sc.nextDouble();
        int tip = sc.nextInt();
        int tax = sc.nextInt();

        total(mealCost,tip,tax);
    }
    
}
