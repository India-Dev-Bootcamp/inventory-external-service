package com.tw.gic.bootcamp.inventoryexternal.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Sms {

    private String message;

    private String phoneNumber;
}
