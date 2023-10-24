package com.lev.joblisting.repository;

import java.util.List;

import com.lev.joblisting.model.Post;

public interface SearchRepository{

    public List<Post> findByText(String text);
}
