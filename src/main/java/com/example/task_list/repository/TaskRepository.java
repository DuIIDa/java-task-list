package com.example.task_list.repository;

import com.example.task_list.domain.task.Task;

import java.util.List;
import java.util.Optional;

public interface TaskRepository {
    Optional<Task> findById(Long id);

    List<Task> findAllByUserId(Long userId);

    void assignToUserById(Long taskId, long userId);

    void update (Task task);

    void create(Task task);

    void delete(Long id);
}
