package fr.exo6_Etudiant2;

public class Student extends Person {

//    public int age =27;

    //Constructeur
    public Student() {
    }
    public Student(int age){
        super(age);
    }

//
//    public Student(int age) {
//        this.age = age;
//    }




    //Methodes
    public void displayAge() {
        System.out.println("My age is :" + getAge()+ "years old");
    }

        public void goToClasses() {
            System.out.println("I'm going to class");

        }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                '}';
    }
}
