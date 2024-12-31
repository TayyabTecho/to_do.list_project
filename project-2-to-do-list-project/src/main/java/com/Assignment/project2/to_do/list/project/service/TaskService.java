package com.Assignment.project2.to_do.list.project.service;

import com.Assignment.project2.to_do.list.project.model.Task;
import com.Assignment.project2.to_do.list.project.repository.TaskRepository;
import com.Assignment.project2.to_do.list.project.request.TaskRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public void createTask(Task task) {
        taskRepository.save(task);
    }

    public Task getById(Long taskId) {
       return taskRepository.findById(taskId).orElseThrow(()->new RuntimeException("taskId not found"));
    }

    public List<Task> getAll() {
        return taskRepository.findAll();
    }

    public void updateTask(@PathVariable Long taskId, @RequestBody TaskRequest taskRequest) {
        Task task1 = taskRepository.findById(taskId).orElseThrow(() -> new RuntimeException("taskId not found"));
        if (taskRequest.getDescription() != null) {
            task1.setDescription(taskRequest.getDescription());
        }
        if (taskRequest.getTitle() != null) {
            task1.setTitle(taskRequest.getTitle());
        }
//        if(task. !=null){
//
//        }

        taskRepository.save(task1);
    }


    public void deleteTask(Long taskId) {
        Task task = taskRepository.findById(taskId).orElseThrow(() -> new RuntimeException("taskId not found"));
        taskRepository.delete(task);
    }
}

