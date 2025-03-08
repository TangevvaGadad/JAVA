//5) thaw si rouy eamn  // Swap only first and last char's in all words

class firstLastswap{
    static void fun(char a[]){
        int n=a.length;
        int s=0;
        for(int i=0;i<n;i++){
            if(i==n-1 || a[i]==' '){
                a[i]=(char)(a[i]+a[s]-(a[s]=(char)a[i]));
                s=i+2;
            }
        }
        for(int i=0;i<n;i++)
        System.out.print(a[i]);
    }
        public static void main(String[] args){
        String arr="What is your name";
        char ch[]=arr.toCharArray();  
        fun(ch);      


    }
}