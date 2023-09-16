
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);

        String carType;
        System.out.println("Type of Car - ");
        carType = S.next();

        S.nextLine();
        System.out.println("Service Codes - ");
        String ServiceCodes= S.nextLine();

        String [] Codes = ServiceCodes.split(" ");

        switch (carType) {
            case "HatchBack" -> {
                HatchBack hatchBack = new HatchBack();
                hatchBack.generateBill(Codes);
            }
            case "Sedan" -> {
                Sedan sedan = new Sedan();
                sedan.generateBill(Codes);
            }
            case "SUV" -> {
                SUV suv = new SUV();
                suv.generateBill(Codes);
            }
            default -> System.out.println("Please enter a valid car name");
        }
    }
}