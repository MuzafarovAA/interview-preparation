package ru.gb.interview.lesson_1.mistake;

public class LightWeightCar extends Car implements Moveable {

    @Override
    void open() {
        System.out.println("Light Weight Car is open");
    }

    @Override
    public void move() {
        System.out.println("Light Weight Car is moving");
    }

}