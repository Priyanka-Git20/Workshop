import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    BirdRepository birdRepository = new BirdRepository();
    UserInterface userInterface = new UserInterface();

    public static void main(String[] args) {
        Main main = new Main();
        int option = 0;
        while(option != 7) {
            option = main.userInterface.showMainMenu();
            main.handleUserSelection(option);
        }
    }

    public void handleUserSelection(int option) {
        switch (option) {
            case 1:
                Bird parrot = new Parrot();
                birdRepository.add(parrot);
                Bird penguin = new Penguin();
                birdRepository.add(penguin);
                Bird duck = new Duck();
                birdRepository.add(duck);
                break;
            case 2:
                userInterface.printAllBirds(birdRepository.getBirdList());
                break;
            case 3:
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the name of bird you want to delete");
                String birdName = sc.nextLine();
                Bird bird = birdRepository.getBird(birdName);
                birdRepository.remove(bird);
                break;
            case 4:
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter the name of bird you want to update");
                String birdName1 = scanner.nextLine();
                Bird bird1 = birdRepository.getBird(birdName1);
                updateBird(bird1);
                break;
            case 5:

                break;
            case 6:
                break;
            case 7:
            default:
                System.out.println("Invalid option");
        }
    }

    private void updateBird(Bird bird){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your selection \n 1.name \n 2.color \n 3.gender ");
        int option = sc.nextInt();

        switch (option){
            case 1:
                System.out.println("Enter the new name");
                bird.name = sc.next();
                break;
            case 2:
                setBirdColor(bird);
                break;
            case 3:
                setBirdGender(bird);
                break;
            default:
                System.out.println("Invalid option");

        }
    }

    private void setBirdGender(Bird bird) {
        System.out.println("Enter the choice \n 1.Female \n 2.Male \n Other ");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        switch (option){
            case 1:
                bird.gender = Bird.Gender.FEMALE;
                break;
            case 2:
                bird.gender = Bird.Gender.MALE;
                break;
            case 3:
                bird.gender = Bird.Gender.OTHER;
                break;
            default:
                System.out.println("Invalid option");
        }
    }

    private void setBirdColor(Bird bird) {
        System.out.println("Enter the choice \n 1.Green \n 2.Red \n 3.Black" +
                           "\n 4.Black_Whilte \n 5.White ");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        switch (option){
            case 1:
                bird.color = Bird.Color.GREEN;
                break;
            case 2:
                bird.color = Bird.Color.RED;
                break;
            case 3:
                bird.color = Bird.Color.BLACK;
                break;
            case 4:
                bird.color = Bird.Color.BLACK_WHITE;
                break;
            case 5:
                bird.color = Bird.Color.WHITE;
                break;
            default:
                System.out.println("Invalid option");
        }
    }
}
