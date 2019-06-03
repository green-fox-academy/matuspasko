package com.reddit.demo.services;

import com.reddit.demo.models.Posts;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostsService {
    private List<Posts> postsList = new ArrayList<>();

    public PostsService(){
        postsList.add(new Posts("Here is post text"));
        postsList.add(new Posts("Second post"));
    }


    public List<Posts> getPostsList() {
        return postsList;
    }
}
