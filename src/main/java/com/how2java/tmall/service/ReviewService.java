package com.how2java.tmall.service;

import com.how2java.tmall.pojo.Review;

import java.util.List;

/**
 * @author XKK
 * @create 2018-01-31 9:02
 * @desc 产品评论
 **/
public interface ReviewService {

    void add(Review r);

    void delete(int id);

    Review get(int id);

    void update(Review r);

    /**
     * 根据产品id获取评论列表
     * @param pid
     * @return
     */
    List<Review> list(int pid);

    /**
     * 根据产品id获取评论数量
     * @param pid
     * @return
     */
    int getCount(int pid);
}