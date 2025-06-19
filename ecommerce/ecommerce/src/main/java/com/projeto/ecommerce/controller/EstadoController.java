package com.projeto.ecommerce.controller;

import com.projeto.ecommerce.domain.Estado;
import com.projeto.ecommerce.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EstadoController {

    @Autowired
    private EstadoRepository estadoRepository;

    @GetMapping("/cadastroEstado")
    public ModelAndView Cadastrar(Estado estado) {
        ModelAndView mv = new ModelAndView("administrativo/estados/cadastro");
        mv.addObject("estado", estado);
        return mv;
    }
    @PostMapping("/salvarEstado")
    public ModelAndView salvar (Estado estado){
        ModelAndView mv = new ModelAndView("administrativo/estados/cadastro/salvar");
        return mv;
    }
}



