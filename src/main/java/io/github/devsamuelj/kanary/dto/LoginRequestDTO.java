package io.github.devsamuelj.kanary.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LoginRequestDTO {

    @NotBlank(message = "O e-mail é obrigatório.")
    @Email
    private String email;

    @NotBlank(message = "Digite uma senha.")
//    @Size(min = 8, max = 20, message = "A senha deve ter entre 8 e 20 caracteres.")
//    @Pattern(
//            regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",
//            message = "A senha deve conter letras maiúsculas, minúsculas, números e caracteres especiais."
//    )
    private String password;


}
