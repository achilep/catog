package com.category.product.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.category.product.dto.ProductDTO;
import com.category.product.models.Product;
import com.category.product.repositories.ProductRepository;

@Service
public class ProductService {
	@Autowired
    private ProductRepository productrepos;
    
    
   // @Override
    public List<ProductDTO> generate() {
        Iterable<Product> products = productrepos.findAll();
        List<ProductDTO> productdtos = new ArrayList<>();
        for(Product category : products) {
            ProductDTO categorytdo = new ProductDTO();
            categorytdo.setDescription(category.getDescription());
            categorytdo.setName(category.getName());
            
            productdtos.add(categorytdo);
        }
        return productdtos;
    }

}
