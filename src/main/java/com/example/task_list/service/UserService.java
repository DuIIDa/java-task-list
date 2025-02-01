package com.example.task_list.service;

import com.example.task_list.domain.user.User;

public interface UserService {
    User getById(Long id);

    User getByUserName(String username);

    User update(User user);

    User create(User user);

    boolean isTaskOwner(Long userId, long taskId);

    void delete(long id);
}
