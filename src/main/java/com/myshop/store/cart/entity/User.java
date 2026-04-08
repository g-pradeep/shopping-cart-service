package com.myshop.store.cart.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "users1")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
}