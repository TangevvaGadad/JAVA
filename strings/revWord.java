    public class revWord{
        static void wordrev(char a[]){
        int n=a.length;
        int s=0;

        for(int i=0;i<n;i++){
            if(i==n-1 || a[i+1]==' '){
             int j=i;   
            while(s<j){
            char t=a[s];
            a[s]=a[j];
            a[j]=t;
            s++;j--;
        }
                s=i+2;
            }
        }
        for(int i=0;i<n;i++)
            System.out.print(a[i]);
    }

    public static void main(String []args){
        String s="what is your name";
        char ch[]=s.toCharArray();        
        wordrev(ch);
    }
    }
