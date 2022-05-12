package fr.exo3_Etudiant;

public class StudentCorrection {

    //Attributs
    String nom;
    int[] notes;

    //Constructeur
    public StudentCorrection() {
        // Valeur par defaut
    }

    //Constructeur surchargé
    public StudentCorrection(String nom, int... notes) {
        this.nom = nom;
        this.notes = notes;
    }

    //Méthodes
    public double calcAverage() {
        double resultat = 0;
        for (int note : this.notes) {
            resultat += note;
        }
        resultat /= this.notes.length;
        return resultat;
    }

    public void show(){
        System.out.println("L'étudiant " + this.nom + " à une moyenne de : " + calcAverage() );
    }
}