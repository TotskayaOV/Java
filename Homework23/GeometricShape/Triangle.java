package Homework23.GeometricShape;

import Homework23.GeometricShape.Base.Polygon;
import Homework23.Interface.Perimetr;

public class Triangle extends Polygon implements Perimetr {
    protected double sideA;
    protected double sideB;
    protected double sideC;

    public Triangle(double sideA, double sideB, double sideC) throws Exception{
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;

        if ((sideA + sideB) < sideC || (sideC + sideB) < sideA || (sideA + sideC) < sideB) {
            throw new Exception("Треугольника с такими сторонами существовать не может");
        }
    }

    @Override
    public double perimetr() {
        return sideA + sideB + sideC;
    }

    @Override
    public double area() {
        double halfMeter = this.perimetr() / 2;
        return Math.sqrt(halfMeter * (halfMeter - sideA) * (halfMeter - sideB) * (halfMeter - sideC));
    }

    @Override
    public String toString() {
        return "Длины сторон треугольника равны а = " + sideA + ", b = " + sideB + ", c = " + sideC;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }
}
