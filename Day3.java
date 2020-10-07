import java.util.*;

class Solution{
    public static void main(String[] t){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

     if( number % 2 == 1 || (number > 5 && number < 21))
        System.out.print("Weird");
    else
        System.out.print("Not Weird");   

    }
}
