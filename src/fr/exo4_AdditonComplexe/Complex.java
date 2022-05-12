package fr.exo4_AdditonComplexe;

import fr.java_tools.JavaTools;

import java.util.ArrayList;
import java.util.List;


public class Complex extends JavaTools {

    private double nbreeel1 = demanderNombre("Entrez la partie réele du premier chiffre");
    private double nbima1 = demanderNombre("Entrez la partie imaginaire du premier chiffre");
    private double nbreeel2 = demanderNombre("Entrez la partie réele du second chiffre");
    private double nbima2 = demanderNombre("Entrez la partie imaginaire du second chiffre");


    //Intégrer dans tableau
    public void danstablo () {
        double[] tabreel = new double[2];
        double[] tabima = new double[2];

        tabreel[0] = nbreeel1;
        tabreel[1] = nbreeel2;
        tabima[0] = nbima1;
        tabima[1] = nbima2;

    }


    public Complex() {
    }

    public Complex(double nbreeel1, double nbima1, double nbreeel2, double nbima2) {
        this.nbreeel1 = nbreeel1;
        this.nbima1 = nbima1;
        this.nbreeel2 = nbreeel2;
        this.nbima2 = nbima2;
    }

    public double getNbreeel1() {
        return nbreeel1;
    }

    public void setNbreeel1(double nbreeel1) {
        this.nbreeel1 = nbreeel1;
    }

    public double getNbima1() {
        return nbima1;
    }

    public void setNbima1(double nbima1) {
        this.nbima1 = nbima1;
    }

    public double getNbreeel2() {
        return nbreeel2;
    }

    public void setNbreeel2(double nbreeel2) {
        this.nbreeel2 = nbreeel2;
    }

    public double getNbima2() {
        return nbima2;
    }

    public void setNbima2(double nbima2) {
        this.nbima2 = nbima2;
    }


    public void som2(double nbreel1, double nbima1, double nbreeel2, double nbima2){

        System.out.println("la somme est de " + (nbreel1 + nbreeel2) + "+ "+ (nbima1 + nbima2)+"i");
    }

    public void som1(double nbreel1, double nbima1){

        System.out.println("la somme est de " + nbreel1  + "+ "+ nbima1 +"i");
    }

    public void som3(double ... tabima){

        System.out.println("la somme est de " + nbima2  + "+ "+ nbima1 +"i");
    }
}


