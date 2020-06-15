package by.epam.javatr.dedik.day3.service;

import by.epam.javatr.dedik.day3.entity.Ball;
import by.epam.javatr.dedik.day3.entity.Basket;
import by.epam.javatr.dedik.day3.entity.Color;

import java.util.Random;

public class BasketFiller {
    public static final int MAX_BALL_WEIGHT = 50;

    private Random random = new Random();

    public void randomFill(Basket basket) {
        Ball ball;
        do {
            ball = randomBall();
            basket.addBall(ball);
        } while (basket.hasPlace(ball));
    }

    public void randomFill(Basket basket, int count) {
        Ball ball;
        for (int i = 0; i < count; i++) {
            ball = randomBall();
            if (basket.hasPlace(ball)){
                basket.addBall(ball);
            } else {
                break;
            }
        }
    }

    public Ball randomBall() {
        int randomWeight = random.nextInt(MAX_BALL_WEIGHT);
        Color randomColor = Color.values()[random.nextInt(Color.values().length)];
        return new Ball(randomWeight, randomColor);
    }
}
