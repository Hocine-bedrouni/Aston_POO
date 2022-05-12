package fr.exo3_Etudiant;

public class Student {

    private String nom;
    private int note1;
    private int note2;

    //Constructeur
    public Student() {

    }

    //Constructeur Override
    public Student(String nom, int note1, int note2) {
        this.nom = nom;
        this.note1 = note1;
        this.note2 = note2;
    }



    public double calcAverage(int note1, int note2) {
       return (double) (note1 + note2) /2;

    }

    public void show(String nom, int note1, int note2 ){

        System.out.println("l'étudiant " + nom +" à une moyenne de "+ calcAverage(note1,note2));
    }



}

