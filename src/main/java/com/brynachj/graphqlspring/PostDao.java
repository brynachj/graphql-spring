package com.brynachj.graphqlspring;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostDao {

    public List<Post> getRecentPosts(int count, int offset) {
        List<Post> posts = new ArrayList<>();
        posts.add(new Post("id1", "title_the", "category-basic", "text of the book", "author-name1234"));
        return posts;
    }
}
