package com.example.task_list.repository;

import com.example.task_list.domain.user.Role;
import com.example.task_list.domain.user.User;

import java.util.Optional;

public interface UserRepository {
    Optional<User> findById(long id);

    Optional<User> findByUsername(String username);

    void update(User user);

    void create(User user);

    void insertUserRole(Long userId, Role role);

    boolean isTaskOwner (Long userId, long taskId);

    void delete (Long id);
}
