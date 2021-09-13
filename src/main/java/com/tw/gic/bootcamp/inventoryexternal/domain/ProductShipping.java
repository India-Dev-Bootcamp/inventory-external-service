package com.tw.gic.bootcamp.inventoryexternal.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class ProductShipping {

    private int serialNumber;

    private int orderId;

    private int customerId;

    private String address;

}
