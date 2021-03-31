package com.uday.hibernate.manytoone;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PostService {
	
	private final PostRepository postRepository;
	
	public Post save(Post post) {
		return postRepository.save(post);
	}

}
