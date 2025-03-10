public class DecToHex{
        public static String binary(int n){
        int rem;
        char hexarr[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String rev="";

        while(n>0){
            rem=n%16;                
            rev=hexarr[rem]+rev;
            n=n/16;
        }
        return rev;
    }
    public static void main(String[] args){
        System.out.println(binary(123));
    }

}