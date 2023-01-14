package com.example.rest.webservice.restfulwebservice.TODO.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.rest.webservice.restfulwebservice.TODO.model.TodoModel;

@Service
public class TodoHardCodedService {
    private static List<TodoModel> todos = new ArrayList<>();
    private static int IdCounter =0; 

    static{
        todos.add(new TodoModel((++IdCounter),"krupa" , "Complete Atomic Habits Book", new Date(), false));
        todos.add(new TodoModel((++IdCounter),"krupa" , "Complete Todo Front End", new Date(), false));
        todos.add(new TodoModel((++IdCounter),"krupa" , "Complete Todo Back End", new Date(), false));
        todos.add(new TodoModel((++IdCounter),"krupa" , "Complete HomeWork", new Date(), false));
    }
    public List<TodoModel> findAll(){
        return todos;
    }

    public TodoModel findById(long id){
        for(TodoModel todo : todos){
            if(todo.getId() == id)
                return todo;
        }
        return null;
    }

    public TodoModel deleteById(long id){
        TodoModel todo = findById(id);
        if(todo == null)
            return null;
        if(todos.remove(todo))
        return todo;
        return null;
    }
}
