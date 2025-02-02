package com.example.task_list.web.mappers;

import com.example.task_list.domain.user.User;
import com.example.task_list.web.dto.user.UserDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);

    User toEntity(UserDto dto);
}
