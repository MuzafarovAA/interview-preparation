package ru.gb.interview.lesson_1.mistake;

public class Lorry extends Car implements Moveable, Stopable {

    @Override
    void open() {
        System.out.println("Lorry is open");
    }

    public void move() {
        System.out.println("Lorry is moving");
    }

    public void stop() {
        System.out.println("Lorry is stop");
    }
}
