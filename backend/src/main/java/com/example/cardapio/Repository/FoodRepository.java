package com.example.cardapio.Repository;

import com.example.cardapio.domain.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {

}
