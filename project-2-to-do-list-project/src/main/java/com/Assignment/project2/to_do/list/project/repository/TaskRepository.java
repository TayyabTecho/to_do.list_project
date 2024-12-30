package com.Assignment.project2.to_do.list.project.repository;

import com.Assignment.project2.to_do.list.project.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task,Long> {
}
