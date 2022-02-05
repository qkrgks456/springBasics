package com.test.good.order;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
