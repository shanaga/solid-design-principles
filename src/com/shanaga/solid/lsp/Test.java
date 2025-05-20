package com.shanaga.solid.lsp;

public class Test {

    public static void main(String[] args) {
        // violate LSP because color of green object is blue
        Green g1 = new Blue();
        g1.getColor(); // output is blue
    }
}
