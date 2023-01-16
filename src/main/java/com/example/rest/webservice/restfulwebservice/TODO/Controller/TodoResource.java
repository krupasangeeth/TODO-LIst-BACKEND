package com.example.rest.webservice.restfulwebservice.TODO.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.webservice.restfulwebservice.TODO.Service.TodoHardCodedService;
import com.example.rest.webservice.restfulwebservice.TODO.model.TodoModel;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class TodoResource {
    @Autowired
    private TodoHardCodedService todoHardCodedService;

    @GetMapping("/users/{username}/todos")
    public List<TodoModel> getAllTodos(@PathVariable String username){
        return todoHardCodedService.findAll();
    }

    @GetMapping("/users/{username}/todos/{id}")
    public TodoModel getTodo(@PathVariable String username, @PathVariable long id){
        return todoHardCodedService.findById(id);
    }

    @DeleteMapping("/users/{username}/todos/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable String username, @PathVariable long id){

        TodoModel todo = todoHardCodedService.deleteById(id);
        if(todo != null){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();

    }



}
