package fr.exo_Point2D;

import java.io.OutputStream;

public class main {
    public static void main(String[] args) {

        Point2D p6 = new Point2D();
        Point2D p7 = new Point2D(8,9);
        Point2D p9 = new Point2D(8,9);
        Point2D p8 = new Point2D(8,9);

//        System.out.println(Point2D.compteur);
        System.out.println("nb Point2D : " + Point2D.getCompteur());

        System.out.println(Point2D.class.getClass());;
        System.out.println(Point2D.class.getSuperclass());;
        System.out.println(p7.getClass());

        System.out.println("hello");
        for( ; ; ){
            System.out.println("hello");

        }



    }
}
