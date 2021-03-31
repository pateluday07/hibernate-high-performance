package com.uday.hibernate.manytoone;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostCommentReposiotry extends JpaRepository<PostComment, Long> {

}
