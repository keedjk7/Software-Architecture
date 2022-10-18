package com.solid.lsp;

public class Square extends Shape{
    private int side;
    private int width;
    private int height;

    Square(int side) {
        this.side = side;
        this.setSide(side);
    }

    public void setSide(int side) {
        this.width = side;
        this.height = side;
    }

    public int getSide() {
        return side;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
    public int getArea() {
        return width * height;
    }
}
