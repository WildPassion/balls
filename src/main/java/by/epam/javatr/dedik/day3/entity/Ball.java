package by.epam.javatr.dedik.day3.entity;

public class Ball {
    private int weight;
    private Color color;

    public Ball() {
    }

    public Ball(int weight, Color color) {
        this.weight = weight;
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
