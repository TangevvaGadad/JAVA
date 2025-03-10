class powOfTwo{
    public static int binary(int n){
        int rem;
        int rev=0;
        int pw=1;

        while(n>0){
            rem=n%2;
            rev=rev+rem*pw;
            pw*=10;
            n=n/2;
        }
        return rev;
    }
    public static void main(String[] args){
        int n=8;
        int m=n-1;
        System.out.println(binary(n));
        if((binary(n)&binary(m))==0)
            System.out.println("2 pow");
        else
            System.out.println("non 2 pow");
    }
}