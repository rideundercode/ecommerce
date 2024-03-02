package com.ecommerce.back.mappers;

import com.ecommerce.back.dtos.ProductDTO;

import com.ecommerce.back.entities.Product;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductMapperImpl {

    public ProductDTO fromProduct(Product product){
        ProductDTO productDTO = new ProductDTO();
        BeanUtils.copyProperties(product , productDTO);
        /*
        productDTO.setIdProduct(product.getIdProduct());
        productDTO.setName(product.getName());
        productDTO.setDescription(product.getDescription());
        productDTO.setPrice(product.getPrice());
        productDTO.setImage(product.getImage());
        productDTO.setStock_quantity(product.getStock_quantity());
        productDTO.setCreationDateCustomer(product.getCreationDateCustomer());
        */
        return productDTO;
    }

    public Product fromProductDTO(ProductDTO productDTO){
        Product product = new Product();
        BeanUtils.copyProperties( productDTO , product);
        /*
        product.setIdProduct(productDTO.getIdProduct());
        product.setName(productDTO.getName());
        product.setDescription(product.getDescription());
        product.setPrice(productDTO.getPrice());
        product.setImage(productDTO.getImage());
        product.setStock_quantity(productDTO.getStock_quantity());
        product.setCreationDateCustomer(productDTO.getCreationDateCustomer());
        */
        return product;
    }
    
}
