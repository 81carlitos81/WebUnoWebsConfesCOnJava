package mx.fes.aragon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
//@RequestMapping(value = "fes")
public class Inicio {
    @GetMapping("inicio")
    public String getInicio(Model model){
        model.addAttribute("saludo","Yo soy tu padre");
        return "index";
    }

    @GetMapping("principal")
    public String getPrincipal(Model model){
        model.addAttribute("saludo","Yo soy tu padre");
        return "principal";
    }

    @GetMapping("paginaUno")
    public String getPaginaUno(Model model){
        model.addAttribute("saludo","Yo soy tu madre");
        return "paginaUno";
    }

    @GetMapping("paginaDos")
    public String getPaginaDos(Model model){
        model.addAttribute("saludo","Alaaan");
        return "paginaDos";
    }
    @GetMapping("paginaTres")
    public String getPaginaTres(Model model){
        model.addAttribute("saludo","Jesúuus");
        return "paginaTres";
    }

}
