package com.example.taskmanager.controller;

import com.example.taskmanager.model.Task;
import com.example.taskmanager.repository.TaskRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TaskController {
    private final TaskRepository repo;
    public TaskController(TaskRepository repo) { this.repo = repo; }

    @GetMapping({"/", "/tasks"})
    public String list(Model model) {
        model.addAttribute("tasks", repo.findAll());
        return "tasks";
    }

    @PostMapping("/tasks")
    public String add(@RequestParam String title) {
        repo.save(new Task(title));
        return "redirect:/tasks";
    }
}
