package com.sp.senac.br.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String paginaInicial(){                              //index a base do back-end
        return  "index";
    }

    @GetMapping("/sobre")
    public String paginaSobre(){
        return  "sobre";
    }

    @GetMapping("/cadastrar_repositorio")
    public String paginaCadastroRepositorio() {
        return "cadastror_repositorio";


    }
}

