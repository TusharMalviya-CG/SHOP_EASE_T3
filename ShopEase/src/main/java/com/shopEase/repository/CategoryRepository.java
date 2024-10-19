package com.shopEase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.shopEase.model.Category_p;

public interface CategoryRepository extends JpaRepository<Category_p, Long> {

	public Category_p findByName(String name);

	@Query("Select c from Category_p c where c.name=:name AND c.parentCategory.name=:parentCategoryName")
	public Category_p findByNameAndParant(@Param("name") String name, @Param("parentCategoryName")String parentCategoryName);
}
