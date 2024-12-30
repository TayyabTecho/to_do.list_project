package com.Assignment.project2.to_do.list.project.service;

import com.Assignment.project2.to_do.list.project.model.Task;
import com.Assignment.project2.to_do.list.project.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public void createTask(Task task) {
        taskRepository.save(task);
    }

    public Task getById(Long taskId) {
        Task task = new Task();
        task.setTitle(task.getTitle());
        task.setDescription(task.getDescription());
        task.setCompleted(task.isCompleted());
        return taskRepository.save(task);
    }

    public List<Task> getAll() {
        return taskRepository.findAll();
    }

    public void updateTask(@PathVariable Long taskId, @RequestBody Task task) {
        Task task1 = taskRepository.findById(taskId).orElseThrow(() -> new RuntimeException("taskId not found"));
        if (task.getDescription() != null) {
            task1.setDescription(task.getDescription());
        }
        if (task.getTitle() != null) {
            task1.setTitle(task1.getTitle());
        }
//        if(task. !=null){
//
//        }

        taskRepository.save(task);
    }


    public void deleteTask(Long taskId) {
        Task task = taskRepository.findById(taskId).orElseThrow(() -> new RuntimeException("taskId not found"));
        taskRepository.delete(task);
    }
}

