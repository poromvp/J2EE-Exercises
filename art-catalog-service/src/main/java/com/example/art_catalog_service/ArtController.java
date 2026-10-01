package com.example.artcatalogservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArtController {

    @GetMapping("/api/art-info")
    public String getArtInfo() {
        return "{\"id\": 1, \"name\": \"Đêm đầy sao\", \"price\": \"1,000,000 VND\"}";
    }
}