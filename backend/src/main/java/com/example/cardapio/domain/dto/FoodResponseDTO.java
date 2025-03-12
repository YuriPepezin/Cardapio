package com.example.cardapio.domain.dto;

import com.example.cardapio.domain.entity.Food;

public record FoodResponseDTO(Long id, String title, String image, Integer price) {
    public FoodResponseDTO(Food food){
        this(food.getId(),food.getTitle(), food.getImage(), food.getPrice());
    }
}
