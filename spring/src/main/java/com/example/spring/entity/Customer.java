package com.example.spring.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data       // @ToString, @EqualsAndHashCode, @Getter-모든 필드, @Setter-final 이 아닌 모든 필드, and @RequiredArgsConstructor
@Entity
public class Customer {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    @Column(length=1024)
    private String address;
}
