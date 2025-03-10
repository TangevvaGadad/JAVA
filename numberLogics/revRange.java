//print first n palindrome
public class revRange{
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
        int c=0;
        int i=0;
        while(c<n){
            if(pal(i)==1){
                System.out.println(i);
                c++;
            }
        i++;
    }}
}