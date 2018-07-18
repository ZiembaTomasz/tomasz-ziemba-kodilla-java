package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int userID;
    private final String username;
    private final char sex;
    private final LocalDate birthday;
    private final int postCount;

    public ForumUser(int userID, String username, char sex, int yearOfBirth, int monthOfBirth, int dayOfBirth, int postCount) {
        this.userID = userID;
        this.username = username;
        this.sex = sex;
        this.birthday = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.postCount = postCount;
    }

    public int getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirthday() {
        return birthday;
    }

    public int getPostCount() {
        return postCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID = " + userID +
                ", username = '" + username + '\'' +
                ", sex = " + sex +
                ", birthday = " + birthday +
                ", postCount = " + postCount +
                '}';
    }
}
