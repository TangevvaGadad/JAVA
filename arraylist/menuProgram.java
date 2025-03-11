// 1. Creating a menu program with the following options:
//     a. Add Element
//     b. Remove Element
//     c. Display Elements
//     d. Exit
// 2. Removing an integer from an ArrayList using a new Integer().
// 3. Removing an integer from an ArrayList using Integer.valueOf().

import java.util.Scanner;
import java.util.ArrayList;

class menuProgram{
    public static void displayMenu(){
        System.out.println();
        System.out.println("1.Add");
        System.out.println("2.Remove");
        System.out.println("3.Display");
        System.out.println("4.Exit");
        System.out.println();
    }
    public static void main(String [] args){
        ArrayList <Integer> num=new ArrayList<>();
        Scanner input=new Scanner(System.in);


        while(true){
            displayMenu();
            System.out.println("Your choice:");
            int choice=input.nextInt();


            if(choice==1){
                //add
                System.out.print("Enetr an integer:");
                num.add(input.nextInt());
                System.out.println("Added");
            }
            else if(choice==2){
                System.out.print("Enter an element to remove:");
                int elementToRemove=input.nextInt();
                if(num.contains(elementToRemove)){
                    num.remove(Integer.valueOf(elementToRemove));
                    System.out.println("Removed");
                }
                else{
                    System.out.println("Element not found");
                }
                //delete
            }
            else if(choice==3){
                System.out.println(num);
                //display
            }
            else if(choice==4){
                break;

            }
        }

    }

}