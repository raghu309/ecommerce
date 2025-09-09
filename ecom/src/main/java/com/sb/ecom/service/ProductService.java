package com.sb.ecom.service;

import com.sb.ecom.model.Product;
import com.sb.ecom.payload.ProductDTO;
import com.sb.ecom.payload.ProductResponse;

import java.net.URI;

public interface ProductService {
    ProductDTO addProduct(Long categoryId, Product product);

    ProductResponse getAllProducts();

    ProductResponse getProductByCategory(Long categoryId);

    ProductResponse getProductByKeyword(String keyword);

    ProductDTO updateProductById(Long productId, Product product);
}
