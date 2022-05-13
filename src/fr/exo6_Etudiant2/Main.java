package fr.exo6_Etudiant2;

import jdk.swing.interop.SwingInterOpUtils;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Person personne1 = new Person();

        personne1.sayHello();
        Student etudiant1 = new Student();
        etudiant1.setAge(666);
        etudiant1.sayHello();
        etudiant1.goToClasses();
        etudiant1.displayAge();
        System.out.println(etudiant1);

        Teacher t1 = new Teacher(40, "un sujet que le prof va faire");
        t1.sayHello();
        System.out.println(t1);
        System.out.println(t1.hashCode());
        t1.setAge(44);
        t1.sayHello();
        System.out.println("mon age de prof est : "+ t1.getAge()+"years old");
        t1.explain();


    }
}
