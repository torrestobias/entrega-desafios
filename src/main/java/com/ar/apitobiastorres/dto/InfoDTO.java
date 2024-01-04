package com.ar.apitobiastorres.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class InfoDTO {

    private Integer cantidadFem;
    private Integer cantidadMasc;
    private List<String> paises;

    public InfoDTO() {
        cantidadFem = 0;
        cantidadMasc = 0;
        paises = new ArrayList<>();
    }
}
