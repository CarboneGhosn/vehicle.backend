package com.daniel.crud.backend.mappers;

import com.daniel.crud.backend.dtos.SignUpDto;
import com.daniel.crud.backend.dtos.UserDto;
import com.daniel.crud.backend.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toUserDto(User user);

    @Mapping(target = "password", ignore = true)
    User signUpToUser(SignUpDto signUpDto);

}
