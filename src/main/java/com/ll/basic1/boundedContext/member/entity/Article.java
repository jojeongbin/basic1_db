package com.ll.basic1.boundedContext.member.entity;

import jakarta.persistence.Id;

public class Article {
    @Id
    private long id;
    private String title;
    private String body;
}
