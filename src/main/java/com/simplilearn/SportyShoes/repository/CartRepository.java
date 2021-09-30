package com.simplilearn.SportyShoes.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.SportyShoes.model.Cart;


public interface CartRepository extends JpaRepository<Cart, Integer>{

}