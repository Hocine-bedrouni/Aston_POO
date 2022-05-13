package fr.exo6_Etudiant2;

public class Person {


    //Attributs
    protected int age =99;

    public Person() {
    }

    public Person(int age) {
        this.age = age;
    }

    public void setAge(int age){
        this.age = age;
//        this.setAge(age);
    }

    public int getAge() {
        return this.age;
    }

    //Methode
    public void sayHello(){
        System.out.println("Hello");
    }
}
