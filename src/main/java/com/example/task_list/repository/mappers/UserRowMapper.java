package com.example.task_list.repository.mappers;

import com.example.task_list.domain.task.Task;
import com.example.task_list.domain.user.Role;
import com.example.task_list.domain.user.User;
import lombok.SneakyThrows;
import org.springframework.security.core.parameters.P;

import java.sql.ResultSet;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserRowMapper {

    @SneakyThrows
    public static User mapRow(ResultSet resultSet) {
        Set<Role> roles = new HashSet<>();
        while(resultSet.next()) {
            roles.add(Role.valueOf(resultSet.getString("user_role_role")));
        }
        resultSet.beforeFirst();
        List<Task> tasks = TaskRowMapper.mapRows(resultSet);
        resultSet.beforeFirst();
        if(resultSet.next()) {
            User user = new User();
            user.setId(resultSet.getLong("user_id"));
            user.setName(resultSet.getString("user_name"));
            user.setUsername(resultSet.getString("user_username"));
            user.setPassword(resultSet.getString("user_password"));
            user.setRoles(roles);
            user.setTasks(tasks);
            return user;
        }
        return null;
    }
}
