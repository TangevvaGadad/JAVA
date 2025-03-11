import java.util.ArrayList;
class contains{
    public static void main(String []args){
        ArrayList <Integer> num=new ArrayList <>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);
        System.out.println(num);
        if(num.contains(60))
            System.out.println("contains");
        else
            System.out.println("not contains");
    }
}