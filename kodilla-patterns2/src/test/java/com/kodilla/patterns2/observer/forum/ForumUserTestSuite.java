package com.kodilla.patterns2.observer.forum;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ForumUserTestSuite {
    @Test
    public void testupdate(){
        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser johnsmith = new ForumUser("John Smith");
        ForumUser ivoneescobar = new ForumUser("Ivone Escobar");
        ForumUser jessiepinkman = new ForumUser("Jessie Pinkman");
        javaHelpForum.registerObserver(johnsmith);
        javaToolsForum.registerObserver(ivoneescobar);
        javaHelpForum.registerObserver(jessiepinkman);
        javaToolsForum.registerObserver(jessiepinkman);
        //When
        javaHelpForum.addPost("Hi everyone! Could you help me with for loop?");
        javaHelpForum.addPost("Better use while loop in this case");
        javaToolsForum.addPost("Help pls, my MySQL db doesn't want to work :(");
        javaHelpForum.addPost("Why while? Is it better?");
        javaToolsForum.addPost("When i try to log in I got 'bad credentials' message.");
        //Then
        assertEquals(3, johnsmith.getUpdateCount());
        assertEquals(2, ivoneescobar.getUpdateCount());
        assertEquals(5, jessiepinkman.getUpdateCount());
    }
}
