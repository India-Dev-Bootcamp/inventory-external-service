package com.tw.gic.bootcamp.inventoryexternal.controller;

import com.tw.gic.bootcamp.inventoryexternal.domain.DigitalDelivery;
import com.tw.gic.bootcamp.inventoryexternal.domain.Email;
import com.tw.gic.bootcamp.inventoryexternal.domain.Sms;
import com.tw.gic.bootcamp.inventoryexternal.domain.ProductShipping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class MainController {

    @GetMapping()
    public ResponseEntity home() {
        return ResponseEntity.ok("Welcome to Inventory External Service. " +
                "See the all the APIs <a href=\"swagger-ui.html\">here</a>");
    }

    @PostMapping("/email")
    public ResponseEntity sendEmail(@RequestBody Email email) {
        System.out.println("Sending email " + email);
        return ResponseEntity.ok("Sent email to " + email.getEmailId());
    }

    @PostMapping("/sms")
    public ResponseEntity sendSms(@RequestBody Sms sms) {
        System.out.println("Sending sms " + sms);
        return ResponseEntity.ok("Sent sms to " + sms.getPhoneNumber());
    }

    @PostMapping("/courierProduct")
    public ResponseEntity courierProduct(@RequestBody ProductShipping productShipping) {
        System.out.println("Shipping product " + productShipping);
        return ResponseEntity.ok("Product shipped to " + productShipping.getAddress());
    }

    @PostMapping("/digitalDelivery")
    public ResponseEntity deliverDigitalProduct(@RequestBody DigitalDelivery digitalDelivery) {
        System.out.println("Delivering digitally  " + digitalDelivery);
        return ResponseEntity.ok("Product digitally delivered to " + digitalDelivery.getEmail());
    }
}
