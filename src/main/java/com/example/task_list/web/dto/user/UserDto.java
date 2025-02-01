package com.example.task_list.web.dto.user;

import com.example.task_list.domain.task.Task;
import com.example.task_list.domain.user.Role;
import com.example.task_list.web.dto.validation.OnCreate;
import com.example.task_list.web.dto.validation.OnUpdate;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
public class UserDto {
    @NotNull(message = "Id must be not null.", groups = OnUpdate.class)
    private long id;

    @NotNull(message = "Name must be not null.", groups = {OnCreate.class, OnUpdate.class})
    @Size(max = 255, message = "Name length must be smaller than 255 symbols.", groups = {OnCreate.class, OnUpdate.class})
    private String name;

    @NotNull(message = "Username must be not null.", groups = {OnCreate.class, OnUpdate.class})
    @Size(max = 255, message = "Username length must be smaller than 255 symbols.", groups = {OnCreate.class, OnUpdate.class})
    private String username;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @NotNull(message = "Password must be not null.", groups = {OnCreate.class, OnUpdate.class})
    private String password;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @NotNull(message = "Password confirm must be not null.", groups = {OnCreate.class})
    private String passwordConfirmation;
}
