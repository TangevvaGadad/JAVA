//10) WIYN HSOA         // [1st char in every word, Print those char's in the FIRST o/p word] and [2nd char in every word, Print it as SECOND word]  

class firstCharToWord{

    static int count(char a[]){
        int n=a.length;
        int min=n;
        int c=1;
        for(int i=0;i<n;i++){
            if(i==n-1 || a[i+1]==' '){
                if(min>c)
                    min=c;
                c=0;
            }
            else
                c++;
        }
        return min;
    }

    static void fun(char a[]){
        int n=a.length;
        int p=0;
        char ch[]=new char[n];

        for(int j=1;j<count(a)+1;j++){
            for(int i=j-1;i<n;i++){
            if(i==j-1 || a[i-j]==' '){
                ch[p++]=a[i];

        }
        }
        ch[p++]=' ';
        }
    
        for(int i=0;i<p;i++)
        System.out.print(ch[i]);
    }
        public static void main(String[] args){
        String arr="what is your name";
        char ch[]=arr.toCharArray();  
        System.out.println(count(ch));   
        fun(ch);   
        System.out.println();   



    }
}