import java.util.ArrayList;
class removeEle{
        public static void main(String []args){
        ArrayList <Integer> num=new ArrayList <>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);
        System.out.println(num);
        num.remove(Integer.valueOf(30));
        System.out.println(num);

    }
}