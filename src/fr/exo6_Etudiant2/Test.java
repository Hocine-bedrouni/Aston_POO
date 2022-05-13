package fr.exo6_Etudiant2;

public class Test {
    public static void main(String[] args) {

        Person personne = new Person();

        personne.sayHello();

        Student stu = new Student();
        stu.sayHello();
        stu.goToClasses();
        stu.displayAge();
        stu.setAge(24);
        stu.displayAge();

        Teacher tea = new Teacher();
        tea.sayHello();

    }
}
