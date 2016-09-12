package com.jason.service;

import com.jason.domain.Post;
import com.jason.mapper.PostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Jason on 2016-09-12.
 */
@Service
public class BlogService {

    @Autowired
    private PostMapper postMapper;

    public List<Post> fetchAllPost() {
        return postMapper.fetchPosts();
    }
}
