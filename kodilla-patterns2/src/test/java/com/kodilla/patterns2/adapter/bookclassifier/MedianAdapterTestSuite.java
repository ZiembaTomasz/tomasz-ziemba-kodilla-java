package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.bookclasifier.MedianAdapter;
import org.junit.Test;
import com.kodilla.patterns2.bookclasifier.librarya.Book;
import static org.junit.Assert.assertEquals;

import java.util.HashSet;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest(){
        //Given
        Book book = new Book("Sapkowski", "Wiedzmin", 1998, "A.S");
        Book book1 = new Book("Tolkien", "Lord of the Rings", 1945, "J.R.R");
        Book book2 = new Book("Rowling", "Harry Potter", 2001, "J.K");

        MedianAdapter medianAdapter = new MedianAdapter();

        HashSet<Book>books = new HashSet<>();
         books.add(book);
         books.add(book1);
         books.add(book2);
         //When
         int mediana = medianAdapter.publicationYearMedian(books);
         //Then
         System.out.println(mediana);
         assertEquals(mediana, 1998);
    }
}
