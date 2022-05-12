package fr.exo4_AdditonComplexe;

public class ComplexCorrection {

    double num1;
    double num1Imaginaire;
    double num2;
    double num2Imaginaire;

    public ComplexCorrection() {
    }

    public ComplexCorrection(double num1, double num1Imaginaire, double num2, double num2Imaginaire) {
        this.num1 = num1;
        this.num1Imaginaire = num1Imaginaire;
        this.num2 = num2;
        this.num2Imaginaire = num2Imaginaire;
    }

    public void sum() {
        System.out.println("La somme est : "+(int)(this.num1 + this.num2) +" + " + (int) (this.num1Imaginaire + this.num2Imaginaire) + "i");
    }
}
