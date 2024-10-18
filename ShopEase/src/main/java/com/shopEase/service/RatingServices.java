package com.shopEase.service;

import java.util.List;

import com.shopEase.exception.ProductException;
import com.shopEase.model.Rating;
import com.shopEase.model.User;
import com.shopEase.request.RatingRequest;

public interface RatingServices {


	public Rating createRating(RatingRequest req,User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);
}
