public class sumdigit{
    public static int sumdigit(int n){
        int res=0;
        while(n>0){
            res=res+n%10;
            n=n/10;
        
        }
        return res;
    }
    public static void main(String[] args){
        System.out.println(sumdigit(1234));
    }
}