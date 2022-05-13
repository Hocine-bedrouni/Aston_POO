package fr.exo_Point2D;

public class Point2D {

    //Attribut
    private int x;
    private int y;
    private static int compteur = 0;

    //Constructeur
    public Point2D(){
        this.x = 10;
        this.y = 50;
    }

    public Point2D(int x, int y) {
        this.x = x;
        this.setY(y);
        Point2D.compteur ++;
    }


    //Getters et setters
    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return y;
    }

    public void setY(int y){
        this.y = y;
    }

    public static int getCompteur() {
        return Point2D.compteur;
    }




    //Methodes
    public void afficher(){
        System.out.println("["+this.x+","+getY()+"]");

    }

    public void translater(int dx, int dy){
        this.x += dx;
        this.y += dy;

    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {

        Point2D p2 = new Point2D();
        Point2D p = new Point2D(5,6);


        p.afficher();
        System.out.println(p);
        p2.afficher();
        System.out.println(p2);
        p.translater(2,3);
        p.afficher();

        System.out.println(Point2D.compteur);

        Point2D p3 = new Point2D(2,3);
        Point2D p4 = new Point2D(2,3);
        Point2D p5 = new Point2D(2,3);
        Point2D p6 = new Point2D();
        Point2D p7 = new Point2D(8,9);

        System.out.println(Point2D.compteur);
        System.out.println("nb Point2D : " + Point2D.getCompteur());


    }



}
