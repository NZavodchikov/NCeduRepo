package com.nzavod.oop.mypiont;

public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint() {

    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        int[] a = new int[2];
        a[0] = x;
        a[1] = y;
        return a;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "{" + x + "," + y + "}";
    }

    public double distance(int x, int y) {
        return (double) (Math.sqrt(Math.pow(this.x - x,2) + Math.pow(this.y - y,2)));
    }
    public double distance(MyPoint another) {
        return (double) (Math.sqrt(Math.pow(this.x - another.getX(),2) + Math.pow(this.y - another.getY(),2)));
    }

    public double distance() {
        return (double) (Math.sqrt(Math.pow(this.x,2) + Math.pow(this.y,2)));
    }
}
