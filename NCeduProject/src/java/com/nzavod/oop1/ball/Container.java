package com.nzavod.oop1.ball;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x, int y, int width, int height) {
        x1 = x;
        y1 = y;
        x2 = x + width;
        y2 = y - height;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public boolean collides(Ball ball) {

        if (ball.getX() + ball.getRadius() + ball.getxDelta() > getX2()) {
            ball.setX(getX2() - ((ball.getX() + ball.getxDelta()) - getX2()) - ball.getRadius() * 2);
            ball.reflectHorizontal();
            System.out.println(ball);
        }

        if (ball.getX() - ball.getRadius() - ball.getxDelta() < getX1()) {
            ball.setX((getX1() - (ball.getX() - ball.getxDelta())) + ball.getRadius() * 2);
            ball.reflectHorizontal();
            System.out.println(ball);
        }

        if (ball.getY() + ball.getRadius() - ball.getyDelta() > getY1()) {
            ball.setY((ball.getY() - ball.getyDelta()) * -1 - (getY1()) - ball.getRadius() * 2);
            ball.reflectVertical();
            System.out.println(ball);
        }


        if (ball.getY() - ball.getRadius() + ball.getyDelta() < getY2()) {
            ball.setY(getY2() - ((ball.getY() + ball.getyDelta()) - getY2()) + ball.getRadius() * 2);
            ball.reflectVertical();
            System.out.println(ball);
        }


        return ball.getX() - ball.getRadius() > x1 && (ball.getX() + ball.getRadius() < x2) && ball.getY() + ball.getRadius() < y1 && ball.getY() - ball.getRadius() > y2;
    }

    @Override
    public String toString() {
        return "Container[(" + x1 + "," + y1 + ",(" + x2 + "," + y2 + ")]";
    }
}
