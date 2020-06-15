package by.epam.javatr.dedik.day3.service;

import by.epam.javatr.dedik.day3.entity.Basket;
import by.epam.javatr.dedik.day3.entity.Color;

public class BallCounter {
    public long countBalls(Basket basket, Color color) {
        return basket.getBalls().stream().filter(ball -> ball.getColor().equals(color)).count();
    }
}
