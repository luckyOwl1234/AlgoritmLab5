package Uppgift_C;

public class Sierpinski extends Flake{


    public void draw(Turtle turtle, int level, double size) {
        this.turtle = turtle;
        turtle.turnTo(0.0);
        drawSide(level, size);
    }

    private void drawTriangle(double size){
        turtle.walk(size);
        turtle.turn(-120.0);
        turtle.walk(size);
        turtle.turn(-120.0);
        turtle.walk(size);
        turtle.turn(-120.0);
    }

    private void drawSide(int n,double size) {
        if (n <= 0)
            drawTriangle(size);
        else {
            double l = size / 2.0;
            drawSide(n - 1, l);
            turtle.jump(l);
            drawSide(n - 1, l);
            turtle.jump(-l);
            turtle.turn(-60.0);
            turtle.jump(l);
            turtle.turn(60.0);
            drawSide(n - 1, l);
            turtle.turn(-60);
            turtle.jump(-l);
            turtle.turn(60);
        }
    }
}
