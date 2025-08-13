package com.my.member.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50, nullable = false)
    private String name;
    private int age;
    private String address;

}
