package epam.javatr.dedik.day3.service;

import by.epam.javatr.dedik.day3.entity.Ball;
import by.epam.javatr.dedik.day3.entity.Basket;
import by.epam.javatr.dedik.day3.entity.Color;
import by.epam.javatr.dedik.day3.service.BallCounter;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BallCounterTest {
    private BallCounter counter;

    @BeforeClass
    public void setUp() {
        counter = new BallCounter();
    }

    public Basket getData() {
        int capacity = 1000;
        Basket basket = new Basket(capacity);
        basket.addBall(new Ball(1, Color.BLUE));
        basket.addBall(new Ball(2, Color.BLACK));
        basket.addBall(new Ball(3, Color.BLUE));
        basket.addBall(new Ball(4, Color.BLACK));
        basket.addBall(new Ball(5, Color.BLUE));
        return basket;
    }

    @Test
    public void countBalls_basketColour_count() {
        long countBlue = counter.countBalls(getData(), Color.BLUE);
        long countDark = counter.countBalls(getData(), Color.BLACK);
        Assert.assertTrue(countBlue == 3 && countDark == 2);
    }
}
