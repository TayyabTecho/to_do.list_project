package com.Assignment.project2.to_do.list.project.controller;

import com.Assignment.project2.to_do.list.project.model.Task;
import com.Assignment.project2.to_do.list.project.request.TaskRequest;
import com.Assignment.project2.to_do.list.project.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping("/")
    public void createTask(@RequestBody Task task){
        taskService.createTask(task);
    }

    @GetMapping("/getTaskById/{taskId}")
    public Task getTaskById(@PathVariable Long taskId){
    return  taskService.getById(taskId);
    }

    @GetMapping("/")
    public List<Task> getAllTask(){
    return taskService.getAll();
    }

    @PutMapping("/updateTask/{taskId}")
    public void updateTask(@PathVariable Long taskId, @RequestBody TaskRequest taskRequest){
    taskService.updateTask(taskId,taskRequest);
    }

    @DeleteMapping("/deleteTask/{taskId}")
    public void deleteTask(@PathVariable Long taskId){
    taskService.deleteTask(taskId);
    }
}
