import java.util.Scanner;
public class SquareOfNum{
    public static int fun(int arr[]){
        int res=0;
        for(int i=0;i<arr.length;i++){
            res=arr[i]*arr[i];
            System.out.println(res);
        }
        return 0; 
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=5;
        int arr[]=new int [n];

        System.out.println("Enter number:");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        fun(arr);

        sc.close();

    }
}