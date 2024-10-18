package com.shopEase.service;

import java.util.List;

import com.shopEase.exception.ProductException;
import com.shopEase.model.Review;
import com.shopEase.model.User;
import com.shopEase.request.ReviewRequest;

public interface ReviewService {

	public Review createReview(ReviewRequest req,User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
	
	
}

