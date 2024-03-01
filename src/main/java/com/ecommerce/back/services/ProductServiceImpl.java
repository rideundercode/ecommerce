package com.ecommerce.back.services;

import com.ecommerce.back.dtos.ProductDTO;
import com.ecommerce.back.entities.Product;
import com.ecommerce.back.exceptions.ProductNotFoundException;
import com.ecommerce.back.mappers.ProductMapperImpl;
import com.ecommerce.back.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    private ProductMapperImpl productMapper;

    @Override
    public ProductDTO createProduct(ProductDTO productDTO) {
        Product product = productMapper.fromProductDTO(productDTO);
        Product productSaved = productRepository.save(product);
        return productMapper.fromProduct(productSaved);
    }                                 

    public ProductDTO getProductDTOById(String idProduct) throws ProductNotFoundException {
        Product product =  productRepository.findById(idProduct)
                .orElseThrow(() -> new ProductNotFoundException("Product not found with ID: " + idProduct));
        ProductDTO productDTO =   productMapper.fromProduct(product);
        return productDTO;
    }

    @Override
    public List<ProductDTO> getAllProducts() {

        if (productRepository == null) {
            return Collections.emptyList();
        }

        List<Product> products = productRepository.findAll();
        List<ProductDTO> productsDTO = products.stream()
                .map(product -> productMapper.fromProduct(product))
                .collect(Collectors.toList());
        return productsDTO;
        /*
        List<ProductDTO> productDTOs = new ArrayList<>();
        for (Product product : products){
          ProductDTO productDTO = dtoMapper.fromProduct(product);
          productDTOS.add(productDTO);
        }
        return productDTOS
         */
    }

    @Override
    public void deletedProductById(String idProduct) {
        productRepository.deleteById(idProduct);
    }

}