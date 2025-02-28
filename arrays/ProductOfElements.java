import java.util.Scanner;
public class ProductOfElements{
    public static int fun(int arr[]){
        int res=1;
        for(int i=0;i<arr.length;i++){
            res=res*arr[i];
        }
        return res;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=5;
        int arr[]=new int [n];

        System.out.println("Enter number:");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        System.out.println(fun(arr));

        sc.close();

    }
}