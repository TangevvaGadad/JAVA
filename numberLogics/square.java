public class square{
    public static int square(int n){
        int temp=0;
        for(int i=1;i<=n/2;i++){
            if((n/i)==i){
                temp=1;
            break;
            }
        }
        if(temp==1)
            return 1;
        else
        return 0;
        
    }
    public static void main(String[] args){
        if(square(25)==1)
            System.out.println("Perfect square");
        else    
            System.out.println("not perfect");
    }
}

