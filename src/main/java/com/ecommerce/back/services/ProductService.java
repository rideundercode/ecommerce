package com.ecommerce.back.services;

import com.ecommerce.back.dtos.ProductDTO;
import com.ecommerce.back.exceptions.ProductNotFoundException;

import java.util.List;

public interface ProductService {

    ProductDTO createProduct(ProductDTO productDTO);
    ProductDTO getProductDTOById(String idProduct) throws ProductNotFoundException;
    List<ProductDTO> getAllProducts();
    void deletedProductById(String idProduct);


}
