package io.github.devsamuelj.kanary.dto;


import io.github.devsamuelj.kanary.entity.UserType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LoginResponseDTO {

        private Long id;
        private String name;
        private String email;
        private UserType role;
}
