package com.crudspring.crudspring.controller;

import com.crudspring.crudspring.mapper.ProductMapper;
import com.crudspring.crudspring.model.Product;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import com.crudspring.crudspring.service.ProductService;

import java.util.List;

@Controller
//@RequestMapping("homepage")
//@Component
//@EnableAutoConfiguration
public class HomePageController {

//    private ProductService productService;

//    public HomePageController(ProductService cc) {
//        this.productService = cc;
//    }

    @Autowired
    ProductMapper productMapper;

    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index");
        List<Product> products = productMapper.getAllProduct();
        System.out.println("get data nè::" + products);
        /*List<Product> listProduct = productMapper.getAllProduct();
        for (Product value : listProduct) {
            System.out.println("get data nè::" + value);
        };*/
        return modelAndView;
    }
}
