package com.nzavod.oop1.ball;

public class Ball {
    private float x;
    private float y;

    private int radius;
    private float xDelta;
    private float yDelta;
    private static int a = 1;
    private static int b = 1;

    public Ball(float x, float y, int radius, int speed, int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        xDelta = (float)(speed * Math.cos(direction * Math.PI/180));
        yDelta = (float)(-speed * Math.sin(direction * Math.PI/180));
    }

    public void move(){
        x = x + (xDelta * a);
        y = y + (yDelta * b);
    }

    public void reflectHorizontal(){
        a = -1 * a;
    }

    public void reflectVertical(){
        b = -1 * b;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getxDelta() {
        return xDelta;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    @Override
    public String toString() {
        return "Ball[(" + x + ", " + y + " , speed=(" + getxDelta() + "," + getyDelta()+ ")]";
    }
}
