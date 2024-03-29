package com.crudspring.crudspring.mapper;

import com.crudspring.crudspring.model.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProductMapper {

    @Select("select * from product")
    List<Product> getAllProduct();

}
