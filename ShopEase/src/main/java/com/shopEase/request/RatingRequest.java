package com.shopEase.request;

import lombok.Data;

@Data
public class RatingRequest {
	
	private Long productId;
	private double rating;

}
