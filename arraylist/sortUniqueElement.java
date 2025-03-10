import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class sortUniqueElement{
    public static void main(String []args){
        ArrayList<Integer> num=new ArrayList<>();
        Scanner input=new Scanner(System.in);
        for(int i=0;i<5;i++){
            int temp=input.nextInt();
        if(!num.contains(temp))
            num.add(temp);
        }
        Collections.sort(num);

        System.out.print(num);

    }
}