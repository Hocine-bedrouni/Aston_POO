package fr.exo4_AdditonComplexe;

import static fr.java_tools.JavaTools.demanderNombre;

public class main {
    public static void main(String[] args) {

//        Complex complex = new Complex();
//        Complex complex2 = new Complex();
//
//        complex.som2(complex.getNbreeel1(), complex.getNbima1(), complex.getNbreeel2(), complex.getNbima2());
//
//        complex.som1(complex.getNbreeel1(), complex.getNbima1());


        System.out.println("--------Premier nombre--------");
        double  num1 = demanderNombre("Saisir le premier reel");
        double  num1Imaginaire = demanderNombre("Saisir le premier imaginaire");

        System.out.println("--------Second nombre--------");
        double  num2 = demanderNombre("Saisir le second reel");
        double  num2Imaginaire = demanderNombre("Saisir le second imaginaire");

      ComplexCorrection somme = new ComplexCorrection(num1, num1Imaginaire, num2, num2Imaginaire);
      somme.sum();


    }


}
