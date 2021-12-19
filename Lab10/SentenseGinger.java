package Lab10;

import java.util.Scanner;

public class SentenseGinger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s;
        int Count = 0;

        System.out.print("Enter a String : ");
        s = scan.nextLine();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ')
                Count++;
        }
        System.out.println("THe number of word is " + (Count + 1));
    }
}
