class octToDec{
        public static int power(int b,int e) {
        int res=1;
        while(e>0){
            res*=b;
            e--;
        }
        return res;
    }
    public static int binary(int n){
        int rem;
        int rev=0;
        int pw=0;

        while(n>0){
            rem=n%10;
            rev=rev+rem*power(8,pw);
            pw++;
            n=n/10;
        }
        return rev;
    }
    public static void main(String[] args){
        System.out.println(binary(235));
    }
}