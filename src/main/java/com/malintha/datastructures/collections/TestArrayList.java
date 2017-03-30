package com.malintha.datastructures.collections;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/**
 * Created by malintha on 3/24/17.
 */
public class TestArrayList {



    public static void main(String[] args) {
        ArrayList<Comment> commentList = new ArrayList<Comment>();
        commentList.add(new Comment(new Date(), "This is awesome"));
        commentList.add(new Comment(new Date(), "Lighting is good"));
        commentList.add(new Comment(new Date(), "We want one more song from him"));
        commentList.add(new Comment(new Date(), "Ops! Can't believe it "));

        Iterator<Comment> commentIterator = commentList.iterator();
        while(commentIterator.hasNext()){
            Comment currentComment = commentIterator.next();
            System.out.println(currentComment.getComment() + " " + currentComment.getNow().toString());
        }
    }
}
