package com.ecommerce.back.controller;
import com.ecommerce.back.exceptions.ProductNotFoundException;
import com.ecommerce.back.services.ProductService;
import com.ecommerce.back.dtos.ProductDTO;
import com.ecommerce.back.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@AllArgsConstructor
@Slf4j
public class ProductController {

    private ProductService productService;
    private ProductRepository productRepository;

    @PostMapping("/")
    public ProductDTO createProduct(@RequestBody ProductDTO productDTO){
        return productService.createProduct(productDTO);
    }

    @GetMapping("/{id}")
    public ProductDTO getProductDTO(@PathVariable(name = "id") String idProduct) throws ProductNotFoundException {
        return productService.getProductDTOById(idProduct);
    }

    @GetMapping("/")
    public List<ProductDTO> getAllProducts(){
        return productService.getAllProducts();
    }

    @DeleteMapping("/{id}")
    public void  deletedcustomerById(@PathVariable(name ="id") String idCustomer){
        productService.deletedProductById(idCustomer);
    }
}
