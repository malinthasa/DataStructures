package com.malintha.datastructures.collections;

import java.util.Date;

/**
 * Created by malintha on 3/30/17.
 */
public class Comment {
    private Date now;
    private String comment;

    public Date getNow() {
        return now;
    }

    public void setNow(Date now) {
        this.now = now;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Comment(Date now, String comment){
        this.now = now;
        this.comment = comment;
    }
}
