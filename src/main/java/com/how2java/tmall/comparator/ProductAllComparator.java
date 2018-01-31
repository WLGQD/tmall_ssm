package com.how2java.tmall.comparator;

import com.how2java.tmall.pojo.Product;

import java.util.Comparator;

/**
 * @author XKK
 * @create 2018-01-31 14:16
 * @desc 综合比较器
 **/
public class ProductAllComparator implements Comparator<Product>{

    @Override
    public int compare(Product p1, Product p2) {
        return p2.getReviewCount()*p2.getSaleCount() - p1.getReviewCount()*p2.getSaleCount();
    }
}