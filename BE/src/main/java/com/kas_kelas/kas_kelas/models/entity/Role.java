package com.kas_kelas.kas_kelas.models.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="roles")
public class Role {

    @Id
    @UuidGenerator
    private UUID id;

    @Column(unique = true)
    private String name;
}
