//6) hwta si oyru anem  // Adjacent Swap in all words

class adjSwap{
    static void fun(char a[]){
        int n=a.length;
        for(int i=0;i<n-1;i=i+2){ //2-1 1+2 =3
            if(a[i]==' ' || a[i+1]==' ') i--;
            else
            {
                char temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
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
