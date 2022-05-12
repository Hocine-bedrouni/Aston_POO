package fr.java_tools;


import fr.exo_PointBis.PointBis;

public class Main {
    public static void main(String[] args) {

        PointBis p1 = new PointBis(5,6);
        PointBis p2 = new PointBis(3,2);

        System.out.printf("La distance entre le p1 et le p2 est de : %.5f" , p1.distance(p2));


//        System.out.println("-----Premier point-----");
//
//        Point p1 = new Point(5,6);
//
//        System.out.println("-----Deuxième point-----");
//        Point p2 = new Point(3,2);
//
//
//       distance(Point.getX1(), Point.getY1(), Point.getX2(), Point.getY2());

    }
}
