package com.crudspring.crudspring.service;

import com.crudspring.crudspring.mapper.ProductMapper;
import com.crudspring.crudspring.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> listProduct() {
        return productMapper.getAllProduct();
    }
}
