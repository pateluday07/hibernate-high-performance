package com.uday.hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uday.hibernate.entity.PostComment;

@Repository
public interface PostCommentReposiotry extends JpaRepository<PostComment, Long> {

}
