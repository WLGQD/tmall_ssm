
package com.how2java.tmall.service;
/**
 * @author XKK
 * @create 2018-01-25 8:58
 * @desc 前台 页面控制
 **/

import com.how2java.tmall.pojo.Category;
import com.how2java.tmall.pojo.Product;

import java.util.List;

public interface ProductService {
    void add(Product c);
    void delete(int id);
    void update(Product c);
    Product get(int id);
    List<Product> list(int cid);

    void setFirstProductImage(Product p);


    /**
     * 前台 商品列表填充
     * @param categorys
     */
    void fill(List<Category> categorys);
    void fill(Category category);
    void fillByRow(List<Category> categorys);


    /**
     *产品设置销量和评价数量
     * @param p
     */
    void setSaleAndReviewNumber(Product p);

    /**
     * 产品设置销量和评价数量
     * @param ps
     */
    void setSaleAndReviewNumber(List<Product> ps);

    /**
     * 搜索
     * @param keyword
     * @return
     */
    List<Product> search(String keyword);
}
