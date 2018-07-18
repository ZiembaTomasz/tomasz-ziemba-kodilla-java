package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beutify(String poem, PoemDecorator poemDecorator){
        String result = poemDecorator.decorate(poem);
        System.out.println("New Poem: " + result);
    }
    public String addWord(String word){
        String word2 = "Voila!";
        return word2;
    }
}
