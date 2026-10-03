package com.example.order_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {

    @GetMapping("/api/order-detail")
    public String getOrderDetails() {
        // Dùng RestTemplate để gọi HTTP sang service Art Catalog (ở port 8081)
        RestTemplate restTemplate = new RestTemplate();
        String artInfo = restTemplate.getForObject("http://localhost:8081/api/art-info", String.class);

        return "Đơn hàng của bạn có chứa bức tranh: " + artInfo;
    }
}