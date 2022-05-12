package fr.exo6_Etudiant2;

public class Teacher extends Person{

    private String subject;
    private int age;

    public Teacher() {
    }

    public Teacher(String subject) {
        this.subject = subject;
    }

    public void explain(){
        System.out.println("Explanation begins");

    }
}
