package br.dev.fwseason2324.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class TaskController {


    @GetMapping("/create)
    

    public String getCreateString(@RequestParam String param) {
        return new String();
    }
    

public string getCreateString(){
    return "create";
    

    
}
