package fr.exo6_Etudiant2;

public class Teacher extends Person{
    //Attributs
    private String subject;
//    private int age;

    //Constructeur
    public Teacher() {
        this.subject = "sujet";
    }
    public Teacher(int age, String subject) {
        super(age);
        this.subject = subject;
    }

    //Getteurs et Setteurs


    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher(String subject) {
        this.subject = subject;
    }

    //Methode
    public void explain(){
        System.out.println("Explanation begins");
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subject='" + subject + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Teacher teacher = (Teacher) o;

        return subject != null ? subject.equals(teacher.subject) : teacher.subject == null;
    }


}
