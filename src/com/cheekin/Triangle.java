package com.cheekin;

import java.util.Scanner;

public class Triangle {

    Scanner s = new Scanner(System.in);

    String Name, Colour, Behavior;
    int EqualInternalAngel, EqualLength;
    char choice;

    void printIdentityScanner(String B, int IA, int L) {
        System.out.println("Enter Name Of Triangle, Colour: ");
        String N = s.nextLine();
        String C = s.nextLine();

        System.out.println("Name Of Triangle: " + N);
        System.out.println("Colour: " + C);
        System.out.println("Behavior: " + B);
        System.out.println("Amount Of Equal Internal Angel: " + IA);
        System.out.println("Amount Of Equal Length: " + L);

    }

    void printPerimeterScanner() {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the Base:");
        Double base = s.nextDouble();

        System.out.print("Enter the height:");
        Double height = s.nextDouble();

        Double areaTriangle = 0.5 * base * height;

        System.out.println("Area of triangle = " + areaTriangle);
    }

    void printBecomeThreeDimensional(String name){
        System.out.println("How many " + name + "do you have" );
        int quantity = s.nextInt();
        if (quantity  >= 4) {
            System.out.println("It will become a three-dimensional.");
        }
        else {
            System.out.println("These are just a few " + name);
        }

    }


    void Base(String name) {
        do {
            System.out.println("\nBase of what do you want it to become? Please choose a or b.  (a: Pyramid or b: Prism)");
            choice = s.next().charAt(0);
            switch (choice) {
                case 'a':
                    System.out.println(name + " has become base of Pyramid." + "\n");
                    break;
                case 'b':
                    System.out.println(name + " has become base of Prism.");
                    break;
                default:
                    System.out.print("Error! Please input only 'a' or 'b'.");
            }

        } while (choice != 'a' && choice != 'b');
    }
}
