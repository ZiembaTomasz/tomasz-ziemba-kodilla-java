package com.kodilla.testing.forum.statistics;




import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateStatisticsTestSuite {


    @Test
    public void test1000PostsWithMock() {
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


        Assert.assertEquals(500, calculate.getAveragePostsPerUsers(),0.1 );
        Assert.assertEquals(5000, calculate.getAverageCommentsPerUser(), 0.1 );
        Assert.assertEquals(10, calculate.getAverageCommentsPerPosts(), 0.1 );
    }
    @Test
    public void test0PostsWithMock(){
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> users = new ArrayList<>();
        users.add("Jacek");
        users.add("Michal");
        int postCount = 0;
        int commentsCount = 10;
        when(statisticsMock.postsCount()).thenReturn(postCount);
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        Calculate calculate = new Calculate();
        calculate.calculateAdvStatistic(statisticsMock);

        Assert.assertEquals(5, calculate.getAveragePostsPerUsers(), 0.1);
        Assert.assertEquals(5, calculate.getAverageCommentsPerUser(), 0.1);
        Assert.assertEquals(1, calculate.getAverageCommentsPerPosts(), 0.1);
    }
    @Test
    public void test0CommentsWithMock(){
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> users = new ArrayList<>();
        users.add("Jacek");
        users.add("michal");
        int postsCount = 10;
        int commentsCount = 0;
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        Calculate calculate = new Calculate();
        calculate.calculateAdvStatistic(statisticsMock);

        Assert.assertEquals(5, calculate.getAveragePostsPerUsers(), 0.1);
        Assert.assertEquals(0, calculate.getAverageCommentsPerUser(), 0.1);
        Assert.assertEquals(0, calculate.getAverageCommentsPerPosts(), 0.1);
    }
    @Test
    public void testLessCommentsThanPosts(){
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> users = new ArrayList<>();
        users.add("Jacek");
        users.add("michal");
        int postsCount = 100;
        int commentsCount = 10;
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        Calculate calculate = new Calculate();
        calculate.calculateAdvStatistic(statisticsMock);

        Assert.assertEquals(50, calculate.getAveragePostsPerUsers(), 0.1);
        Assert.assertEquals(5, calculate.getAverageCommentsPerUser(), 0.1);
        Assert.assertEquals(0.1, calculate.getAverageCommentsPerPosts(),0.1);
    }
    @Test
    public void test100users(){
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> users = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            users.add("Imie i Nazwisko " + i);
        }
        int postsCount = 100;
        int commentsCount = 1000;
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        Calculate calculate = new Calculate();
        calculate.calculateAdvStatistic(statisticsMock);

        Assert.assertEquals(1, calculate.getAveragePostsPerUsers(), 0.1);
        Assert.assertEquals(10, calculate.getAverageCommentsPerUser(), 0.1);
        Assert.assertEquals(10, calculate.getAverageCommentsPerPosts(), 0.1);
    }
    @Test
    public void test0users(){
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> users = new ArrayList<>();
        int postsCount = 100;
        int commentsCount = 1000;
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        Calculate calculate = new Calculate();
        calculate.calculateAdvStatistic(statisticsMock);

        Assert.assertEquals(10, calculate.getAveragePostsPerUsers(), 0.1);
        Assert.assertEquals(100, calculate.getAverageCommentsPerUser(), 0.1);
        Assert.assertEquals(10, calculate.getAverageCommentsPerPosts(), 0.1);
    }
}




