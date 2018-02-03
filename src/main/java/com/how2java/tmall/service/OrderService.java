package com.how2java.tmall.service;

import com.how2java.tmall.pojo.Order;
import com.how2java.tmall.pojo.OrderItem;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: XKK
 * Date: 2018-01-29
 * Time: 13:39
 */
public interface OrderService {
    String waitPay = "waitPay";
    String waitDelivery = "waitDelivery";
    String waitConfirm = "waitConfirm";
    String waitReview = "waitReview";
    String finish = "finish";
    String delete = "delete";

    void add(Order c);

    void delete(int id);
    void update(Order c);
    Order get(int id);
    List list();


    /**
     * 添加订单
     * @param c
     * @param ois
     * @return
     */
    float add(Order c,List<OrderItem> ois);

    List<Order> list(Integer id, String delete);
}
