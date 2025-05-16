package com.ontrack;

public class Task {
    public String id;
    public String title;
    public String dueDate;
    public String taskSheetURL;

    public Task(String id, String title, String dueDate, String taskSheetURL) {
        this.id = id;
        this.title = title;
        this.dueDate = dueDate;
        this.taskSheetURL = taskSheetURL;
    }
}
