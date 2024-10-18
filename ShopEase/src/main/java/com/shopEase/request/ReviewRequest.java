package com.shopEase.request;

import lombok.Data;

@Data
public class ReviewRequest {
	
	private Long ProductId;
	private String review;

}
