package com.sb.ecom.controller;

import com.sb.ecom.model.Category;
import com.sb.ecom.model.Product;
import com.sb.ecom.payload.ProductDTO;
import com.sb.ecom.payload.ProductResponse;
import com.sb.ecom.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/admin/category/{categoryId}/product")
    public ResponseEntity<ProductDTO> addProduct( @PathVariable Long categoryId, @RequestBody Product product) {
        return new ResponseEntity<>(productService.addProduct(categoryId, product), HttpStatus.CREATED);
    }

    @GetMapping("/public/products")
    public ResponseEntity<ProductResponse> getAllProducts() {
        return ResponseEntity.ok(productService.getAllProducts());
    }

    @GetMapping("public/category/{categoryId}/product")
    public ResponseEntity<ProductResponse> getProductByCategory(@PathVariable Long categoryId) {
        return ResponseEntity.ok(productService.getProductByCategory(categoryId));
    }

    @GetMapping("public/products/keyword/{keyword}")
    public ResponseEntity<ProductResponse> getProductByKeyword(@PathVariable String keyword) {
        return new ResponseEntity<>(productService.getProductByKeyword(keyword), HttpStatus.FOUND);
    }

    @PutMapping("admin/product/{productId}")
    public ResponseEntity<ProductDTO> updateProductById(@PathVariable Long productId, @RequestBody Product product) {
        return new ResponseEntity<>(productService.updateProductById(productId, product), HttpStatus.OK);
    }
}
