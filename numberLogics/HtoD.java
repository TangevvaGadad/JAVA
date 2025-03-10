class BtoO{
        public static int power(int b,int e) {
        int res=1;
        while(e>0){
            res*=b;
            e--;
        }
        return res;
    }
    public static String binary(int n){
        int rem;
        int pw=0;
        String rev="";
        char hexarr[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        while(n>0){
            rem=n%10;
            rev=rev+rem*power(16,pw);
            pw++;
            n=n/10;
        }
        return rev;
    }
    public static void main(String[] args){
        System.out.println(binary("7B"));
    }
}