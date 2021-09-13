package com.tw.gic.bootcamp.inventoryexternal.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Email {


    private String emailId;

    private String subject;

    private String content;


}
