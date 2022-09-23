package com.example.spring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data       // @ToString, @EqualsAndHashCode, @Getter-모든 필드, @Setter-final 이 아닌 모든 필드, and @RequiredArgsConstructor
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) // data.sql 에도 자동으로 아이디 생성
    private int id;
    private String name;
    @Column(length=1024)
    private String address;
}
