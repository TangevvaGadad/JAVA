//7) w2a4 i2 y2u4 n2m4  // Replace with it's place value number on alternative positions

class altPos{
    public static void fun(char ch[]){
        int n = ch.length;
        int count=1;
        int s=0;
        for(int i=0;i<n-1;i+=2){
            if(ch[i]!=' ' && ch[i+1]==' '){
                ch[i]=(char)(count+'0');
                count=0;
            }
            else
                i--;
        }
        for(int i=0;i<n;i++)
            System.out.print(ch[i]);
        }

    public static void main(String[] args){
        String arr="What is your name";
        char ch[]=arr.toCharArray();  
        fun(ch);      


    }
}
