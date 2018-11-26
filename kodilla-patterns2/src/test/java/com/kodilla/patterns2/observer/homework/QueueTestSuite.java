package com.kodilla.patterns2.observer.homework;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class QueueTestSuite {
    @Test
    public void checkingTest(){
        //Given
        Queue queue = new Queue("J. Malkovich");
        Queue queue1 = new Queue("A. Susan");
        Menthor menthor = new Menthor("George");
        Menthor menthor1 = new Menthor("Max");
        queue.register(menthor);
        queue1.register(menthor1);
        //When
        queue.addTask("Chapter 7.4");
        queue.addTask("Chapter 7.8");
        queue.addTask("Chapter 8.4");
        queue1.addTask("Chapter 6.6");
        queue1.addTask("Chapter 7.2");
        //Then
        assertEquals(3, menthor.getUpdateCount());
        assertEquals(2, menthor1.getUpdateCount());
    }
}
