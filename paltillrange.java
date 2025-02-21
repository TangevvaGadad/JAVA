//print till n palindrome
public class paltillrange{
    public static int pal(int n){
        int x=n;
        int rem;
        int rev=0;
        while(n!=0){
            rem=n%10;
            n=n/10;
            rev=rev*10+rem;
            
        }
        if(x==rev)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args){
        int n=15;
        int i=0;
        for(i=0;i<n;i++)
            System.out.println(i);

}
}
