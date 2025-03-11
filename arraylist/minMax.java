import java.util.ArrayList;
class minMax{
        public static void main(String []args){
        ArrayList <Integer> num=new ArrayList <>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);
        System.out.println(num);
        int n=num.size();

        int min=num.get(0);int max=num.get(0);
        for(int i=1;i<n;i++){
            if(num.get(i)<min) min=num.get(i);
            if(num.get(i)>max) max=num.get(i);            
        }

        System.out.println("max:"+max);
        System.out.println("min:"+min);
    }
}