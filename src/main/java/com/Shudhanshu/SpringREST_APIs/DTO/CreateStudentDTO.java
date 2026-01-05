package com.Shudhanshu.SpringREST_APIs.DTO;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.Singular;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class CreateStudentDTO {
    @NotBlank(message = "Name id required")
    @Size(min = 2, max = 50)
    String name;

    @Email
    @NotBlank(message = "Email is required")
    String email;
}
