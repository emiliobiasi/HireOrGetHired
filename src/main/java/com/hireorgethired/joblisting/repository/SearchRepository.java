package com.hireorgethired.joblisting.repository;

import com.hireorgethired.joblisting.models.Post;

import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);
}
