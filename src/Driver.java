import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String in = "";
        int menuChoice = 0;

        Hamburger burger = new Hamburger();

        do {

            do {
                System.out.print("Add a condiment to your burger [Up to 6]  (1) Add (2) Quit ? ");
                in = input.nextLine();
                try {
                    menuChoice = Integer.parseInt(in);
                } catch (Exception e) {
                    menuChoice = 0;
                }
                if (menuChoice < 1 || menuChoice > 2) {
                    System.out.println("Invalid option - please try again...");
                }
            } while (menuChoice < 1 || menuChoice > 2);
            if (menuChoice == 1) {
                //Add prompt for condiment to add
                System.out.print("Enter the name of your condiment: ");
                in = input.nextLine();
                burger.addCondiment(in);

            }

        }
        while (menuChoice != 2 && burger.getCondimentCount() < 6);

        burger.display();



    }
}
