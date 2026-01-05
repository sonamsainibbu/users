package com.user.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username",
            unique = true,
            nullable = false,
            length = 30)
    private String username;

    @Column(name = "email",
            unique = true,
            nullable = false)
    private String email;

    @Column(name = "password",
            nullable = false)
    private String password;
}
