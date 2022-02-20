import java.util.List;
import java.util.Scanner;

public class UserInterface {
    public void printAllBirds(List<Bird> list){
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }

    public int showMainMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Add Bird");
        System.out.println("2.Print all Birds");
        System.out.println("3.Remove Bird");
        System.out.println("4.Update the birds");
        System.out.println("5.Print Swimmable Birds");
        System.out.println("6.Print Flyable Birds");
        System.out.println("7.Exit");
        System.out.println("Enter your choice");

        return (sc.nextInt());
    }
}
