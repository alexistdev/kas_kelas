package com.kas_kelas.kas_kelas.models.entity;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="users")
public class Users {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String name;

    @Column(unique=true, nullable=false)
    private String email;

    private String password;

    private String token;

    @ManyToOne
    @Nullable
    private Role role;

}
