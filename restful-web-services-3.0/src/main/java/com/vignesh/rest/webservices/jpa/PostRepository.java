package com.vignesh.rest.webservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vignesh.rest.webservices.user.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
