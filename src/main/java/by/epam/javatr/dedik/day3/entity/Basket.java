package by.epam.javatr.dedik.day3.entity;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private int capacity;
    private int value;
    private List<Ball> balls;

    public Basket(int capacity) {
        this.capacity = capacity;
        this.balls = new ArrayList<>();
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getValue() {
        return value;
    }

    public List<Ball> getBalls() {
        return balls;
    }

    public boolean hasPlace(Ball ball) {
        return value + ball.getWeight() < capacity;
    }

    public void addBall(Ball ball) {
        if (hasPlace(ball)) {
            balls.add(ball);
            value += ball.getWeight();
        }
    }
}
