package com.kodilla.patterns2.bookclasifier;

import com.kodilla.patterns2.bookclasifier.librarya.Book;
import com.kodilla.patterns2.bookclasifier.librarya.Clasifier;

import java.util.Arrays;

import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Clasifier {
    @Override
    public int publicationYearMedian(Set<Book> books){
        int [] years = new int [books.size()];
        int n =0;
        for (Book bookset : books) {
            years[n] = bookset.getPublicationYear();
            n++;
        }
        Arrays.sort(years);
        if (years.length % 2 ==0){
            return years[(int)(years.length / 2 + 0.5)];
        }else{
            return years[years.length / 2];
        }
    }
}
