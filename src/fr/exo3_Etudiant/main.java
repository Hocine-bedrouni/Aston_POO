package fr.exo3_Etudiant;

import fr.java_tools.JavaTools;

import java.util.ArrayList;

public class main extends JavaTools {
    public static void main(String[] args) {


        // Code pour class Student
//        for (int i = 0; i <= 3; i++) {
//            int note1 = demanderNombre("Entrer votre première note");
//            int note2 = demanderNombre("Entrez votre seconde note");
//            String nom = demanderNom("Entrez votre nom");
//
//            Student etudiant = new Student();
//
//            etudiant.show(nom, note1, note2);
//        }

        //Code pour classe StudentCorrection
        String nom = demanderNom("Saisir nom de l'étudiant");

        int note1 = demanderNombre("Saisir 1ère note");
        int note2 = demanderNombre("Saisir 2ème note");
        int note3 = demanderNombre("Saisir 3ème note");

        StudentCorrection etudiant = new StudentCorrection(nom, note1, note2);

        etudiant.show();
        String nom2 = demanderNom("Saisir nom de l'étudiant");
        StudentCorrection etudiant2 = new StudentCorrection(nom2, note1, note2, note3);
//        etudiant2.notes[1] = 5;
        etudiant2.show();
    }
}

