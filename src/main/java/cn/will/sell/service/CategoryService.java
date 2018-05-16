package cn.will.sell.service;


import cn.will.sell.dataobject.ProductCategory;

import java.util.List;

/**
 * 类目
 * Created by will
 * 2017-05-09 10:12
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
