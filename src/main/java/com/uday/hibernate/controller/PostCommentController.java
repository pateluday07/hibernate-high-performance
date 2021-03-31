package com.uday.hibernate.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uday.hibernate.entity.PostComment;
import com.uday.hibernate.service.PostCommentService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/post-comment")
public class PostCommentController {

	private final PostCommentService postCommentService;

	@PostMapping
	public ResponseEntity<String> save(@RequestBody PostComment comment) {
		postCommentService.save(comment);
		return ResponseEntity.ok("Post comment saved successfully");
	}
	
	@GetMapping("/{id}")
	public PostComment getById(@PathVariable Long id) {
		return postCommentService.getById(id);
	}
}
