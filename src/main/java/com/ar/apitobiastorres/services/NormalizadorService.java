package com.ar.apitobiastorres.services;

import com.ar.apitobiastorres.dto.InfoDTO;

import java.io.IOException;

public interface NormalizadorService {

    String normalizarDireccion();

    InfoDTO getData();

    String monedaDePais(String pais);
}
