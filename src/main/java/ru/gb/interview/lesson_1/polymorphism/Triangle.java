package ru.gb.interview.lesson_1.polymorphism;

public class Triangle extends Figure {

    private final double sideA;
    private final double sideB;
    private final double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public void drawFigure() {
        System.out.println("Drawing Triangle");
    }

    @Override
    public double getPerimeter() {
        return (sideA + sideB + sideC);
    }

}
