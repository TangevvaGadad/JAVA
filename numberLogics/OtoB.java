class OtoB{
    public static int binary(int n){
        int rem;
        int rev=0;
        int pw=1;

        while(n>0){
            rem=n%8;
            rev=rev+rem*pw;
            pw*=10;
            n=n/8;
        }
        return rev;
    }
    public static void main(String[] args){
        System.out.println(binary(64));
    }
}