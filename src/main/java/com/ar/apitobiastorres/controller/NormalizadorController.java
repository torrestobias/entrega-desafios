package com.ar.apitobiastorres.controller;

import com.ar.apitobiastorres.dto.InfoDTO;
import com.ar.apitobiastorres.services.NormalizadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api")
public class NormalizadorController {


    @Autowired
    private NormalizadorService normalizadorService;

    @GetMapping(value = "/probando")
    public String direccionNormalizada (){
        return normalizadorService.normalizarDireccion();
    }

//
//    @GetMapping
//    public String nearObelisk(@PathVariable("direccion") String direccion){
//        return normalizadorService.kmNearObelisk;
//    }

    @GetMapping
    public String monedaPais (@PathVariable ("pais") String pais){
        return normalizadorService.monedaDePais(pais);
    }

    @GetMapping("/extraer-info")
    public InfoDTO extraerInformacion(){
        return normalizadorService.getData();
    }

}
