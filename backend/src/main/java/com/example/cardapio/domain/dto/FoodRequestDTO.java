package com.example.cardapio.domain.dto;
import com.example.cardapio.domain.entity.Food;


public record FoodRequestDTO (String title, String image, Integer price){
}
