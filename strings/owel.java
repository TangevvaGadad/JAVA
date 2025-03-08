//8) whAt Is yOUr nAmE  // Replace lower Vowels with Upper case Vowels
class owel{
    static void fun(char a[]){
        int n=a.length;
        for(int i=0;i<n;i++){
            if(a[i]==' ') continue;
            if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u')
                a[i]=(char)(a[i]-32);
            else
                continue;

        }
        for(int i=0;i<n;i++)
        System.out.print(a[i]);
    }
        public static void main(String[] args){
        String arr="what is your name";
        char ch[]=arr.toCharArray();  
        fun(ch);      


    }
}
//sir aproach
//print uppercase
// for(int i=0;i<n;i++){
//     if(a[i]>=97 && a[i]<=122)
//             a[i]=(char)(a[i]-32);
// }


//conv upp
// static boolean vowel(char k){
// char v[]{'a','e','i','o','u'};
// for(int i=0;i<5;i++){
//     if(v[i]==k)
//         return true;
//     return false;
// }
// }

// static char nextvowel(char k){
// char v[]{'a','e','i','o','u'};
// for(int i=0;i<5;i++){
//     if(v[i]==k)
//         return v[i+1]%5;
//     return ' ';
// }
// }
// static void vowelUp(char a[]){
//             int n=a.length;
//         for(int i=0;i<n;i++){
//             char nv=vowel(a[i])
//             if(nv!=' ')
//                 a[i]=(char)(nv-32);
//         }
//         for(int i=0;i<n;i++)
//         System.out.print(a[i]);

// }
