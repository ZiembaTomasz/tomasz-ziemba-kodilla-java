package com.kodilla.testing.forum.statistics;




import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateStatisticsTestSuite {


    @Test
    public void test1000postsWithMock() {
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> users = new ArrayList<>();
        users.add("Jacek");
        users.add("Michal");
        int postsCount = 1000;
        int commentsCounts = 10000;
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(commentsCounts);
        Calculate calculate = new Calculate();
        calculate.calculateAdvStatistic(statisticsMock);


        Assert.assertEquals(500, calculate.averagePostsPerUsers,0.1 );
        Assert.assertEquals(5000, calculate.averageCommentsPerUser, 0.1 );
        Assert.assertEquals(10, calculate.averageCommentsPerPosts, 0.1 );
    }
    @Test
    public void test0postsWithMock(){
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> users = new ArrayList<>();
        users.add("Jacek");
        users.add("Michal");
        int postCount = 100;
        int commentsCount = 0;
        when(statisticsMock.postsCount()).thenReturn(postCount);
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        Calculate calculate = new Calculate();
        calculate.calculateAdvStatistic(statisticsMock);

        Assert.assertEquals(0, calculate.averagePostsPerUsers);

    }
}




