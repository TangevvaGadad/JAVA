import java.util.Scanner;
public class linearSearch{
    public static int fun(int arr[],int key){
        int res=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key)
                return i;
        }
        return 0;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=5;
        int key;
        int res;
        int arr[]=new int [n];

        System.out.println("Enter number:");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("key:");
        key=sc.nextInt();
        res=fun(arr,key);
        if(res==0)
            System.out.println("Key not found");
        else
            System.out.println("Key found in the position:"+(res));

        sc.close();

    }
}
