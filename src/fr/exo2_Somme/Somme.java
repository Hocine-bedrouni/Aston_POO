package fr.exo2_Somme;

import java.util.Scanner;

public class Somme {

    //Attribut
    static double n1;
     static double n2;

    //Constructeur
    public Somme() {
    }

    //Constructeur surchargé
    public Somme(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public void sum(double n1, double n2){

         System.out.println("La somme est de "+ n1 +" et " + n2+" = " + (n1+n2));
    }

    public static double demanderNombre(String phrase ) {
        Scanner scan = new Scanner(System.in);
        System.out.println(phrase);
        double nombre = scan.nextInt();
        return nombre;

    }


}
