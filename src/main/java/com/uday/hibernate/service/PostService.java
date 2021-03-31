package com.uday.hibernate.service;

import org.springframework.stereotype.Service;

import com.uday.hibernate.entity.Post;
import com.uday.hibernate.repository.PostRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PostService {
	
	private final PostRepository postRepository;
	
	public Post save(Post post) {
		return postRepository.save(post);
	}

}
