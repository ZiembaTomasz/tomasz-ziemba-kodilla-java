package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;


public class LibraryTestSuite {
    @Test
    public void testGetBooks(){

        LocalDate firstBook = LocalDate.of(1988, 06, 15);
        LocalDate secondBook = LocalDate.of(2000, 10, 13);
        LocalDate thirdBook = LocalDate.of(2007, 03, 11);
        Book book1 = new Book("Harry Potter", "J.K. Rowling", firstBook);
        Book book2 = new Book("Witcher", "A. Sapkowski", secondBook);
        Book book3 = new Book("Grave", "Nexxaramas", thirdBook);

        Library library = new Library("First Library");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);


        Library clonedLibrary = null;
        try{
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Second Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try{
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Third Library");
        } catch(CloneNotSupportedException e) {
            System.out.println(e);
        }
        library.getBooks().remove(book1);
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(2, clonedLibrary.getBooks().size());
        Assert.assertEquals(3, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}
