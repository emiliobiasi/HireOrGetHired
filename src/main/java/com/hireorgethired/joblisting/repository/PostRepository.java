package com.hireorgethired.joblisting.repository;

import com.hireorgethired.joblisting.models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {}
