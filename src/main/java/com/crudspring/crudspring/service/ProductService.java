package com.crudspring.crudspring.service;

import com.crudspring.crudspring.model.Product;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public interface ProductService {

    List<Product> listProduct();
}
