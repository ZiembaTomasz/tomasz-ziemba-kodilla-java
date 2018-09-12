package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "Hibernate's Test";

    @Test
    public void testFindByListName(){
        TaskList taskList = new TaskList(DESCRIPTION, "TO_DO");
        taskListDao.save(taskList);
        String listname = taskList.getListName();

        List<TaskList>readTaskList = taskListDao.findByListName(listname);

        Assert.assertEquals(1, readTaskList.size());

        int id = readTaskList.get(0).getId();
        taskListDao.delete(id);
    }

}
