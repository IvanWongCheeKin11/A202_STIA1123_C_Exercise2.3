package com.cheekin;

public class Main {

    public static void main(String[] args) {

        Triangle Equilateral = new Triangle();
        System.out.println("1. Equilateral" + "\n");
        Equilateral.printIdentityScanner("can be cut", 3, 3);
        Equilateral.printPerimeterScanner();
        Equilateral.printBecomeThreeDimensional("Equilateral");
        Equilateral.Base("Equilateral");

        Triangle Isosceles = new Triangle();
        System.out.println("2. Isosceles" + "\n");
        Isosceles.printIdentityScanner("can be cut", 2, 2);
        Isosceles.printPerimeterScanner();
        Isosceles.printBecomeThreeDimensional("Isosceles");
        Isosceles.Base("Isosceles");

        Triangle Scalene = new Triangle();
        System.out.println("3. Scalene" + "\n");
        Scalene.printIdentityScanner("can be cut", 0, 0);
        Scalene.printPerimeterScanner();
        Isosceles.printBecomeThreeDimensional("Isosceles");
        Isosceles.Base("Isosceles");

    }
}
