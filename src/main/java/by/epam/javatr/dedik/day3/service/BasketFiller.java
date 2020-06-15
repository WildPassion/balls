package by.epam.javatr.dedik.day3.service;

import by.epam.javatr.dedik.day3.entity.Ball;
import by.epam.javatr.dedik.day3.entity.Basket;
import by.epam.javatr.dedik.day3.entity.BallColor;

import java.util.Random;

public class BasketFiller {
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
        int randomWeight = random.nextInt(Ball.MAX_WEIGHT);
        BallColor randomColor = BallColor.values()[random.nextInt(BallColor.values().length)];
        return new Ball(randomWeight, randomColor);
    }
}
