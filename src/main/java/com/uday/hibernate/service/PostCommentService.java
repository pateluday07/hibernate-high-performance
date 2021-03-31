package com.uday.hibernate.service;

import org.springframework.stereotype.Service;

import com.uday.hibernate.entity.Post;
import com.uday.hibernate.entity.PostComment;
import com.uday.hibernate.repository.PostCommentReposiotry;
import com.uday.hibernate.repository.PostRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PostCommentService {

	private final PostCommentReposiotry commentReposiotry;
	private final PostRepository postRepository;
	
	public void save(PostComment comment) {
		Post post = postRepository.getOne(comment.getPostId());
		comment.setPost(post);
		commentReposiotry.save(comment);
	}
	
	public PostComment getById(Long id) {
		PostComment comment = commentReposiotry.findById(id).get();
		comment.setPost(null);
		return comment;
	}
}
