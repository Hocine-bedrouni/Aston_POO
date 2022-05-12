package fr.exo6_Etudiant2;

public class Test {
    public static void main(String[] args) {

        Person personne = new Person();

        personne.sayHello();

        Student stu = new Student(15);
        stu.sayHello();
        stu.GoToClasses();
        stu.displayAge();

        Teacher tea = new Teacher();
        tea.sayHello();

    }
}
