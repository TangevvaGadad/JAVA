class VowelUp{
    static boolean vowel(char k){
char t[]={'a','e','i','o','u'};
for(int i=0;i<5;i++){
    if(t[i]==k)
        return true;
}
    return false;

}
public static void fun(char a[]){
    int n=a.length;
    char v[]=new char[n];
    int flag=0;
    for(int i=0;i<n;i++){
        if(a[i]==' '){
            v[i]=' ';
        }
        if(vowel(a[i]) && flag==0){
            v[i]=(char)(a[i]-32);
            flag=1;
        }
        else if(a[i]!=' '){
        if(flag==0){
            v[i]=(char)(a[i]-1);
        }
        else
        v[i]=(char)(a[i]+1);

        }  
        else
            flag=0;      
    }
    for(int i=0;i<n;i++)
        System.out.print(v[i]);

}
        public static void main(String[] args){
        String arr="what is your name";
        char ch[]=arr.toCharArray();  
        fun(ch);   
        System.out.println();   



    }

}