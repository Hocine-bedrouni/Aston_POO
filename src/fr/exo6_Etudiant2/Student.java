package fr.exo6_Etudiant2;

public class Student extends Person {

    public int age;

    public Student() {
    }

    public Student(int age) {
        this.age = age;
    }

    public void displayAge() {
        System.out.println("My age is :" + getAge());
    }


    public void GoToClasses() {
        System.out.println("I'm going to class");

    }
};
