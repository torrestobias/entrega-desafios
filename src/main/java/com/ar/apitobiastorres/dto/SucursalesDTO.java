package com.ar.apitobiastorres.dto;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SucursalesDTO {

    private String createdAt;
    private String nombre;
    private String direccion;
    private List<String> geo;
    private String genero;
    private String pais;
    private String id;



}
