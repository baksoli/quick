package com.shop.quick.order.service;

import com.shop.quick.order.entity.Order;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
