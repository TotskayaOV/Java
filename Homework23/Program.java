package Homework23;

import java.util.ArrayList;

import Homework23.GeometricShape.Circle;
import Homework23.GeometricShape.Rectangle;
import Homework23.GeometricShape.Square;
import Homework23.GeometricShape.Triangle;
import Homework23.GeometricShape.Base.Shape;
import Homework23.Interface.Perimetr;

public class Program {
    public static void main(String[] args) throws Exception {
        ArrayList<Shape> figures = new ArrayList<>();
        figures.add(new Rectangle(4, 5));
        figures.add(new Square(5));
        figures.add(new Triangle(4, 5, 3));
        figures.add(new Circle(12));
        figures.add(new Triangle(3, 7, 9));

        Menu.AllPrint(figures);
        System.out.println(figures.get(1).area());
        System.out.println(((Perimetr) figures.get(1)).perimetr());
        System.out.println(figures.get(2).area());
        System.out.println(figures.get(3).area());
    }

}
