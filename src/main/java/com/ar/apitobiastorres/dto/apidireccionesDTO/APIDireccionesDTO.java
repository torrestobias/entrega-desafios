package com.ar.apitobiastorres.dto.apidireccionesDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class APIDireccionesDTO {

    private Integer cantidad;
    private List<DireccionDTO> direccionesDTO;
    private Integer inicio;
    private ParametrosDTO parametrosDTO;
    private Integer total;
}
