public class revNum{
    public static int revNum(int n){
        int rem;
        int rev=0;
        while(n!=0){
            rem=n%10;
            n=n/10;
            rev=rev*10+rem;
            
        }
    }
    public static void main(String[] args){
        System.out.println(revNum(1234));
    }
}