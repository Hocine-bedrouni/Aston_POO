package fr.java_tools;

import java.util.Scanner;

public class JavaTools {

    public static int demanderNombre(String phrase) {
        Scanner scan = new Scanner(System.in);
        System.out.println(phrase);
        int nombre = scan.nextInt();
        return nombre;
    }

    public static String demanderNom(String phrase) {
        Scanner scan = new Scanner(System.in);
        System.out.println(phrase);
        String nom = scan.nextLine();
        return nom;
    }

}