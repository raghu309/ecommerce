package com.sb.ecom.repo;

import com.sb.ecom.model.Category;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByCategoryName(@NotBlank(message = "Category Name cannot be blank.") @Size(min = 5, message = "Category Name should have at least 5 characters.") String categoryName);
}
