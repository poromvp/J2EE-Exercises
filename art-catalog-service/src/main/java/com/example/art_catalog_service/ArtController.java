package com.example.art_catalog_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArtController {

    @GetMapping("/api/art-info")
    public String getArtInfo() {
        return "{\"id\": 1, \"name\": \"Đêm đầy sao\", \"price\": \"1,000,000 VND\"}";
    }
}