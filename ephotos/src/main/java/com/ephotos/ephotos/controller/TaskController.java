package com.ephotos.ephotos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TaskController {

    @GetMapping("/login")
    public String create(){
        return "login";
    }

    @GetMapping("/principal")
    public String principal(){
        return "principal";
    }
    @GetMapping("/principal/agenda")
    public String agenda(){
        return "agenda";
    }
    @GetMapping("/principal/clientes")
    public String clientes(){
        return "clientes";
    }

    @GetMapping("/principal/sessoes")
    public String sessoes(){
        return "sessoes";
    }
    @GetMapping("/principal/controle")
    public String controle(){
        return "controle";
    }
}
