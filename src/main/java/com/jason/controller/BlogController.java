package com.jason.controller;

import com.jason.domain.Post;
import com.jason.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Jason on 2016-09-12.
 */
@Controller
public class BlogController {

    private BlogService blogService;

    @Autowired
    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @GetMapping
    @ResponseBody
    public List<Post> fetchAllPost() {
        return blogService.fetchAllPost();
    }
}