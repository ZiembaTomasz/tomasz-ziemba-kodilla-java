package com.kodilla.spring.portfolio;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest

public class BoardTestSuite {
    @Autowired
    private Board board;
    @Test
    public void testTaskAdd(){

        board.toDoList.tasks.add("next Task");
        board.inProgressList.tasks.add("Actual Task");
        board.doneList.tasks.add("Done Task");

        Assert.assertEquals(1, board.toDoList.tasks.size());
        Assert.assertEquals(1, board.inProgressList.tasks.size());
        Assert.assertEquals(1, board.doneList.tasks.size());
    }
}
