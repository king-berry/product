package com.example.demo.Service;

import com.example.demo.DTO.ProductDTO;
import com.example.demo.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    List<Product> getAllProducts();
    Product getProductByName(String name);
    void addProduct(ProductDTO productDTO);
    void updateProduct(long id, ProductDTO updatedProductDTO);
    void deleteProduct(long id);
}
