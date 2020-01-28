package com.kodilla.stream.world;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class PoemMain{
    public static void main(String[]args){
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beutify("Hello", poem -> poem + " World");
        poemBeautifier.beutify("Hello",poem -> poem.toUpperCase());
        poemBeautifier.beutify("Hello", poem -> poem.toLowerCase());
        poemBeautifier.beutify("Hello",poem -> poem.substring(3));
    }


}
