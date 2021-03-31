package com.uday.hibernate.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uday.hibernate.entity.Post;
import com.uday.hibernate.service.PostService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/post")
public class PostController {
	
	private final PostService postService;

	@PostMapping
	public Post save(@RequestBody Post post) {
		return postService.save(post);
	}
}
