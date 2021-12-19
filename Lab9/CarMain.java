package Lab9;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Make;
        String Model;
        int Years;

        Car vechile;
        vechile = new Car();

        System.out.print("Brand: ");
        Make = scan.nextLine();
        vechile.setMake(Make);

        System.out.print("Model: ");
        Model = scan.nextLine();
        vechile.setModel(Model);

        System.out.print("Made in: ");
        Years = scan.nextInt();
        vechile.setYears(Years);

        vechile.tostring();
        System.out.println("");
        vechile.isAntique();
    }
}
