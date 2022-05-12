package fr.exo2_Somme;

import static fr.exo2_Somme.Somme.*;


public class Main {
    public static void main(String[] args) {

            Somme som = new Somme(n1,n2);



        double n1 = demanderNombre("Entrez un premier chiffre");
        double n2 = demanderNombre("Entrez un second chiffre");

      som.sum(n1,n2);


    }
}
