package com.jason.domain;

import lombok.Data;
import lombok.Setter;

import java.sql.Timestamp;

/**
 * Created by Jason on 2016-09-12.
 */
@Data
@Setter
public class Comment {

    private Integer id;
    private Post post;
    private String name;
    private String email;
    private String content;
    private Timestamp createdOn;
}
