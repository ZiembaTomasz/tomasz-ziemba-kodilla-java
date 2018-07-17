package com.kodilla.testing.forum.statistics;

public class Calculate {

   private int usersCount;
   private int postsCount;
   private int commentsCount;
   private double averagePostsPerUsers;
   private double averageCommentsPerUser;
   private double averageCommentsPerPosts;

    public void calculateAdvStatistic(Statistics statistics) {
        usersCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        if(statistics.postsCount() == 0 && statistics.usersNames().size() == 0){
            averagePostsPerUsers = ((double)statistics.postsCount() + 10) / (statistics.usersNames().size() +10);
        }
        else if(statistics.postsCount() == 0){
            averagePostsPerUsers = ((double)statistics.postsCount() + 10) / statistics.usersNames().size();
        }
        else if(statistics.usersNames().size() ==0 ){
            averagePostsPerUsers = (double)statistics.postsCount() / (statistics.usersNames().size() +10);
        }

        else {
            averagePostsPerUsers = (double)statistics.postsCount() / statistics.usersNames().size();
        }
        if(statistics.usersNames().size() == 0){
            averageCommentsPerUser= (double)statistics.commentsCount()  / (statistics.usersNames().size()+ 10);
        }
        else{
            averageCommentsPerUser= (double)statistics.commentsCount()  / statistics.usersNames().size();
        }

        if(statistics.postsCount() == 0){
            averageCommentsPerPosts =  (double)statistics.commentsCount()  / (statistics.postsCount()+ 10);
        }
        else {
            averageCommentsPerPosts =  (double)statistics.commentsCount() / statistics.postsCount();
        }
    }

    public int getUsersCount() {
        return usersCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {

        return commentsCount;
    }

    public double getAveragePostsPerUsers() {
        return averagePostsPerUsers;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPosts() {
        return averageCommentsPerPosts;
    }

    public void showStatistic() {
        System.out.println("Number of Users = " + usersCount);
        System.out.println("Number of posts = " + postsCount);
        System.out.println("Numbers of comments = " + commentsCount);
        System.out.println("Average of posts per users = " + averagePostsPerUsers);
        System.out.println("Average of comments per users = " + averageCommentsPerUser);
        System.out.println("Average of comments per posts = " + averageCommentsPerPosts);
    }
}
