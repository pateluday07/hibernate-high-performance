package com.uday.hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uday.hibernate.entity.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
