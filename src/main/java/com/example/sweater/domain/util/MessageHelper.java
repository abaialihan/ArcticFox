package com.example.sweater.domain.util;

import com.example.sweater.domain.User;

public class MessageHelper {

    public static String getAuthorName(User author){
        return author != null ? author.getUsername() : "<none>";
    }

}
