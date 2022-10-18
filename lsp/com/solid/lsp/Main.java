package com.solid.lsp;

public class Main {

    private static final int width = 4;
    private static final int height = 5;

    public static void main(String[] args) {
        Rectangle reg1 = new Rectangle(width, height);
        System.out.println("==== Rectangle ====");
        System.out.println("Width = " + reg1.getWidth());
        System.out.println("Height = " + reg1.getHeight());
        System.out.println("Area = " + reg1.getArea());

        Square squ2 = new Square(5);
        squ2.setSide(width);
        squ2.setSide(height);
        System.out.println("====   Square  ====");
        System.out.println("Width = " + squ2.getWidth());
        System.out.println("Height = " + squ2.getHeight());
        System.out.println("Area = " + squ2.getArea());
    }
}
