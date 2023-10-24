package com.lev.joblisting.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lev.joblisting.model.Post;


public interface PostRepository extends MongoRepository<Post, String>{
    
}
