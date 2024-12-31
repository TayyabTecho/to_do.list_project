package com.Assignment.project2.to_do.list.project.request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter@Setter
public class TaskRequest {

    private String title;
    private String description;
    private Boolean completed;

//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public Boolean isCompleted() {
//        return completed;
//    }
//
//    public void setCompleted(Boolean completed) {
//        this.completed = completed;
//    }
}
