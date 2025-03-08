//9) whEt Os yUAr nEmI  // Replace vowels with the next VOWEL in Upper case

class nextvowel{
    static char nextvowel(char k){
char v[]={'a','e','i','o','u'};
for(int i=0;i<5;i++){
    if(v[i]==k)
        return v[(i+1)%5];
}
    return ' ';

}
static void vowelUp(char a[]){
            int n=a.length;
        for(int i=0;i<n;i++){
            char nv=nextvowel(a[i]);
            if(nv!=' ')
                a[i]=(char)(nv-32);
        }
        for(int i=0;i<n;i++)
        System.out.print(a[i]);

}

        public static void main(String[] args){
        String arr="what is your name";
        char ch[]=arr.toCharArray();  
        vowelUp(ch); 
        System.out.println();     


    }


}