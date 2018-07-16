package com.kodilla.testing.forum.statistics;

public class Calculate {
    Statistics statistics;
    int usersCount;
    int postsCount;
    int commentsCount;
    double averagePostsPerUsers;
    double averageCommentsPerUser;
    double averageCommentsPerPosts;

    public void calculateAdvStatistic(Statistics statistics)
    {
        usersCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        averagePostsPerUsers = (double)statistics.postsCount() / statistics.usersNames().size();
        averageCommentsPerUser= (double)statistics.commentsCount()  / statistics.usersNames().size();
        averageCommentsPerPosts =  (double)statistics.commentsCount() / statistics.postsCount();
    }
    public void showStatistic()
    {
        System.out.println("Number of Users = " + usersCount);
        System.out.println("Number of posts = " + postsCount);
        System.out.println("Numbers of comments = " + commentsCount);
        System.out.println("Average of posts per users = " + averagePostsPerUsers);
        System.out.println("Average of comments per users = " + averageCommentsPerUser);
        System.out.println("Average of comments per posts = " + averageCommentsPerPosts);
    }
}
