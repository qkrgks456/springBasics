package com.test.good.order;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Order {

    private Long memberId;
    private String itemName;
    private int itemPrice;
    private int disCountPrice;

    public int resultPrice() {
        return itemPrice - disCountPrice;
    }

}
