package fr.exo5_Point;

import fr.java_tools.JavaTools;

public class Point extends JavaTools {

   public static double x1;
   public static double x2;
   public static double y1;
   public static double y2;

    public Point() {
    }

    public Point(double x1, double y1) {
        Point.x1 = x1;
        Point.y1 = y1;
    }

    public Point(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public static double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public static double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public static double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public static double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }


    public static double dist(double x1, double x2, double y1, double y2) {
        double resultat =  Math.sqrt((getX2()-getX1())*(getX2()-getX1()) + (getY2()-getY1())*(getY2()-getY1()));
       return resultat;

    }

    }


