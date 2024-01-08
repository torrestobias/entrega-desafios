package com.ar.apitobiastorres.controller;

import com.ar.apitobiastorres.dto.InfoDTO;
import com.ar.apitobiastorres.dto.apidireccionesDTO.APIDireccionesDTO;
import com.ar.apitobiastorres.services.NormalizadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class NormalizadorController {


    @Autowired
    private NormalizadorService normalizadorService;

    @GetMapping(value = "/normalizar")
    public APIDireccionesDTO direccionNormalizada (){
        return normalizadorService.normalizarDireccion();
    }

    @GetMapping
    public String monedaPais (@PathVariable ("pais") String pais){
        return normalizadorService.monedaDePais(pais);
    }

    @GetMapping("/extraer-info")
    public InfoDTO extraerInformacion(){
        return normalizadorService.getData();
    }

}
