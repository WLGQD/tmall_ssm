package com.how2java.tmall.comparator;

import com.how2java.tmall.pojo.Product;

import java.util.Comparator;

/**
 * @author XKK
 * @create 2018-01-31 14:21
 * @desc 价格比较器
 **/
public class ProductPriceComparator implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o1.getPromotePrice() -  o2.getPromotePrice());
    }
}