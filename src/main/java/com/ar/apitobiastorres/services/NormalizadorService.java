package com.ar.apitobiastorres.services;

import com.ar.apitobiastorres.dto.InfoDTO;
import com.ar.apitobiastorres.dto.apidireccionesDTO.APIDireccionesDTO;

import java.io.IOException;

public interface NormalizadorService {

    APIDireccionesDTO normalizarDireccion();

    InfoDTO getData();

    String monedaDePais(String pais);
}
