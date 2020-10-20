import java.util.*;

class Solution{

    static void check(String str){
        String str1="";

        for( int i=0;i<str.length();i++)
        {
            if( i % 2 == 0)
                System.out.print(str.charAt(i));
            else
                str1 += str.charAt(i);
            
        }
        System.out.print(" "+str1);
        System.out.println();
    }
    public static void main(String[] e){

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        for( int i=0;i<size;i++){
            String str = sc.next();

            check(str);
        }
    }
}