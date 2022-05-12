package fr.exo6_Etudiant2;

public class Person {

    protected int age;

    public void sayHello(){
        System.out.println("Hello");
    }

    public void setAge( int age){
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
