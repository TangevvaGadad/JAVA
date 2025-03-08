class numToword{
    static void numToword(int n){
        String one[]={"","one","two","three","four","five",
                        "six","seven","eight","nine"};
        String teens[]={"Ten","eleven","tweleve","thirteen","fourteen",
                        "fifyteen","sixteen","seventeen","eighteen",
                        "ninteen"};
        String tens[]={"","","twenty","thirty","fourty","fifty","sixty",
                        "seventy","eighty","ninty"};
        if(n==0){
            System.out.println("zero");
            return;
        }
        if(n>=1000){
            System.out.print(one[n/1000]+" Thousand ");
            n=n%1000;
        }
        if(n>=100){
            System.out.print(one[n/100]+" hundred ");
            n=n%100;
        }
        if(n>=20){
            System.out.print(tens[n/10]+" ");
            n=n%10;
        }
        if(n>=10){
            System.out.print(teens[n%10]+" ");
        }
        if(n<10){
            System.out.print(one[n]);
        }
    }
        public static void main(String []args){
            int n=134;
       
        numToword(n);
        System.out.println();
    }
}