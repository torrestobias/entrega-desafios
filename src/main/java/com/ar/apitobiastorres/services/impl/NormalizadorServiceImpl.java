package com.ar.apitobiastorres.services.impl;

import com.ar.apitobiastorres.dto.InfoDTO;
import com.ar.apitobiastorres.dto.SucursalesDTO;
import com.ar.apitobiastorres.services.NormalizadorService;
import com.google.gson.Gson;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

@Service("NormalizadorService")
public class NormalizadorServiceImpl implements NormalizadorService {

    @Value("${api.sucursales}")
    private String apiSucursales;

    @Value("${api.ubicacion}")
    private String apiUbicacion;

    private final RestTemplate restTemplate;

    public NormalizadorServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String normalizarDireccion() {

        String respuesta = restTemplate.getForObject(apiUbicacion,String.class);



        return respuesta;
    }



    @Override
    public InfoDTO getData() {

        Gson gson = new Gson();
        String respuesta = restTemplate.getForObject(apiSucursales, String.class);
        ArrayList<SucursalesDTO> sucursalesDTOList = new ArrayList<>(Arrays.asList(gson.fromJson(respuesta,SucursalesDTO[].class)));
        InfoDTO infoDTOp = new InfoDTO();
        sucursalesDTOList.forEach(sucursalesDTO -> mappeador(sucursalesDTO, infoDTOp));

        return infoDTOp;
    }

    @Override
    public String monedaDePais(String pais) {
        return null;
    }

    private void mappeador(SucursalesDTO sucursalesDTO, InfoDTO infoDTO){

        if(sucursalesDTO.getGenero().equalsIgnoreCase("male"))
            infoDTO.setCantidadMasc(infoDTO.getCantidadMasc() + 1);
        else
            infoDTO.setCantidadFem(infoDTO.getCantidadFem() + 1);

         if (!infoDTO.getPaises().contains(sucursalesDTO.getPais())){
             List<String> paises = infoDTO.getPaises();
             paises.add(sucursalesDTO.getPais());
             infoDTO.setPaises(paises);
         }
    }

}
