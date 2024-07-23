package com.kas_kelas.kas_kelas.requests;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserRequest {
    @NotEmpty(message="Name is required")
    private String name;

    @NotEmpty(message="Email is required")
    @Email
    private String email;

    @NotEmpty(message="Password is required")
    private String password;
}
