package com.kodilla.stream;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beutify("Carpe Diem ",(poem) -> poemBeautifier.addWord("Voila"));
        poemBeautifier.beutify("Quo Vadis", (poem) -> poem.toUpperCase());
        poemBeautifier.beutify("VENI, VIDI, VICI", (poem) -> poem.toLowerCase());
        poemBeautifier.beutify("Take it easy", (poem) -> poem.substring(7));
        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
