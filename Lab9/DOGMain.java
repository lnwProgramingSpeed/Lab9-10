package Lab9;

import java.util.Scanner;

public class DOGMain {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s;
        int d;
        
        DOG puppy;
        puppy = new DOG();

        System.out.print("Your Dog name : ");
        s = scan.nextLine();
        puppy.setDogName(s);

        System.out.print("Your Dog Age : ");
        d = scan.nextInt();
        puppy.setAge(d);

        puppy.tostring();
    }
}
