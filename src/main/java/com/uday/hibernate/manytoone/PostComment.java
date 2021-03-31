package com.uday.hibernate.manytoone;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Getter;
import lombok.Setter;

@Table
@Entity
@Getter
@Setter
public class PostComment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String review;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Post post;
	
	@Transient
	private Long postId;
	

}
