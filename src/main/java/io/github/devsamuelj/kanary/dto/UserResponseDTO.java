package io.github.devsamuelj.kanary.dto;

import io.github.devsamuelj.kanary.entity.UserType;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class UserResponseDTO {

    private Long id;
    private String name;
    private String email;
    private UserType role;

}
