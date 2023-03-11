package Homework23;

import java.util.ArrayList;

import Homework23.GeometricShape.Base.Shape;

public class Menu {
    
    public static void AllPrint(ArrayList<Shape> figures){
        int count = 1;
        System.out.println("\n-------Все фигуры в списке на текущий момент-------\n");
        for (Shape element: figures){
            System.out.println(count + ". " + element);
            count += 1;
        }
        System.out.println();
    }



}
