package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> theUsersList = new ArrayList<>();
    public Forum(){
        theUsersList.add(new ForumUser(0001, "Mefisto", 'M', 1988, 6, 15, 7));
        theUsersList.add(new ForumUser(0002, "Angelic", 'F', 2000, 4, 30, 78));
        theUsersList.add(new ForumUser(0003, "Hefi", 'M', 1999, 8, 15, 4));
    }
    public List<ForumUser> getUserList()
    {
        return new ArrayList<>(theUsersList);
    }
}
