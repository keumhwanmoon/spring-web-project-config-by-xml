package com.jason.mapper;

import com.jason.domain.Post;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by Jason on 2016-09-12.
 */
@Mapper
public interface PostMapper {
    public List<Post> fetchPosts();
}
