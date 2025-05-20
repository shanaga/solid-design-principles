package com.shanaga.solid.lsp.solution;

public class Test {
    public static void main(String[] args) {
        IColor color = new Green();
        IColor color1 = new Blue();

        color.getColor();
        color1.getColor();
    }
}
