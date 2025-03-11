import java.util.ArrayList;
class reverse{
        public static void main(String []args){
        ArrayList <Integer> num=new ArrayList <>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);
        System.out.println(num);
        int n=num.size();

        for(int i=0;i<n/2;i++){
            int temp=num.get(i);
            num.set(i,num.get(n-1-i));
            num.set(n-1-i,temp);
           
        }

        System.out.println(num);
    }
}