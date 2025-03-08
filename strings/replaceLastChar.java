//4) wha4 i2 you4 nam4  // Replace Last char with it's own place value number in all 
class replaceLastChar{
    public static void fun(char ch[]){
        int n = ch.length;
        int count=1;
        int s=0;
        for(int i=0;i<n;i++){
            if(i==n-1 || ch[i+1]==' '){
                ch[i]=(char)(count+'0');
                count=0;
            }
            else
                count++;
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
