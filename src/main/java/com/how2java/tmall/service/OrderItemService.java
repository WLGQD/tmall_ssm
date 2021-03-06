package com.how2java.tmall.service;

import com.how2java.tmall.pojo.Order;
import com.how2java.tmall.pojo.OrderItem;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: XKK
 * Date: 2018-01-29
 * Time: 13:42
 */
public interface OrderItemService {
    void add(OrderItem c);

    void delete(int id);
    void update(OrderItem c);
    OrderItem get(int id);
    List list();

    void fill(List<Order> os);

    void fill(Order o);

    /**
     * 根据产品获取销售量
     * @param pid
     * @return
     */
    int getSaleCount(int pid);

    /**
     * 查询用户的所有未生成订单的 订单条目
     * @param uid
     * @return
     */
    List<OrderItem> listByUser(int uid);
}
