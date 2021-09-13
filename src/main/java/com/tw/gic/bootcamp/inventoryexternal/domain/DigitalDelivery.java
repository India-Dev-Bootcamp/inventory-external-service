package com.tw.gic.bootcamp.inventoryexternal.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class DigitalDelivery {

    private int productId;

    private String email;
}
