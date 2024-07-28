package com.kas_kelas.kas_kelas.dto;

import com.kas_kelas.kas_kelas.models.entity.Roles;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LoginDTO {

    private String id;

    private String name;

    private String email;

    private String token;

    private Roles roles;

}
