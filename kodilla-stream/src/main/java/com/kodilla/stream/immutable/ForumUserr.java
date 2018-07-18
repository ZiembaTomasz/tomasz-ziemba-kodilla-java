package com.kodilla.stream.immutable;

public final class ForumUserr {
    private final String username;
    private final String realName;

    public ForumUserr(final String username, final String realName) {
        this.username = username;
        this.realName = realName;
    }

    public String getUsername() {
        return username;
    }

    public String getRealName() {
        return realName;
    }
}
