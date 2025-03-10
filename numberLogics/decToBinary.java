class decToBinary{
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
        System.out.println(binary(13));
    }
}