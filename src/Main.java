import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean validValue = false;
        double maximumTankCarry = 0;
        double mpg = 0;
        double pricePerGallon = 0;
        double pricePer100m;
        double distanceLeft;

        do {
            System.out.println("Enter current number of Gallons in your tank");
            if (scan.hasNextDouble()) {
                maximumTankCarry = scan.nextDouble();
                if (maximumTankCarry >= 0) {
                    validValue = true;
                } else {
                    System.out.println("You have entered an invalid value for the cost per gallon, try again NOW!");
                }
            } else {
                System.out.println("You have entered an invalid value for the gallons in your tank, try again NOW!");
            }
            scan.nextLine();
        } while (!validValue);

        validValue = false;

        do {
            System.out.println("Enter fuel effiency in mpg");
            if (scan.hasNextDouble()) {
            mpg = scan.nextDouble();
                if (mpg > 0) {
                    validValue = true;
                } else {
                    System.out.println("You have entered an invalid value for the cost per gallon, try again NOW!");
                }
            } else {
                System.out.println("You have entered an invalid value for the fuel effiency, try again NOW!");
            }
            scan.nextLine();
        } while (!validValue);

        validValue = false;
        do {
            System.out.println("Enter current price for a gallon per gas");
            if (scan.hasNextDouble()) {
                pricePerGallon = scan.nextDouble();
                if (pricePerGallon > 0) {
                    validValue = true;
                } else {
                    System.out.println("You have entered an invalid integer for the cost of gallons");
                }
            } else {
                System.out.println("You entered an invalid integer for the cost per gallon try again!");
            }
            scan.nextLine();
        } while (!validValue);

        pricePer100m = 100 / mpg * pricePerGallon;
        distanceLeft = maximumTankCarry * mpg;

        System.out.printf("%-15s %10.2f", "your cost per gallon is ", pricePer100m);
        System.out.printf("\n%-15s %10.2f", "the distance you have remaining is:", distanceLeft);
    }
}