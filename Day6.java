import java.util.*;

class Solution{
    static void check(int[] arr){
        
        int i=0;
            int j=arr.length -1;
        while( i <j){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }

            for( int k =0;k<arr.length;k++)
                System.out.print(arr[k]+" ");

        }

    public static void main(String[] e){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();

            check( arr);

    }
}