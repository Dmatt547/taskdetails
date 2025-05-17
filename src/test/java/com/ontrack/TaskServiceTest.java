package com.ontrack;

import static org.junit.Assert.*;
import com.ontrack.TaskService;

import org.junit.Test;

public class TaskServiceTest {

    @Test
    public void testGetTaskDetailsReturnsCorrectInfo() {
        TaskService service = new TaskService();
        Task task = service.getTaskDetails("9.1P");

        assertNotNull(task);
        assertEquals("TDD and CI", task.title);
        assertEquals("2025-05-21", task.dueDate);
        assertEquals("https://ontrack.deakin.edu.au/tasksheets/tdd-ci.pdf", task.taskSheetURL);
    }
    
    @Test
    public void testGetTaskDetailsReturnsNullForUnknownTask() {
        TaskService service = new TaskService();
        Task task = service.getTaskDetails("999X");
        assertNull(task);
    }

    //test push
}
