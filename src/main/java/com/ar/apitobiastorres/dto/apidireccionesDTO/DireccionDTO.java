package com.ar.apitobiastorres.dto.apidireccionesDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class DireccionDTO {

    private AlturaDTO altura;
    private CalleDTO calle;
    private CalleCruceDTO calle_cruce_1;
    private CalleCruceDTO calle_cruce_2;
    private DepartamentoDTO departamento;
    private LocalidadCensalDTO localidad_censal;
    private String nomenclatura;
    private String piso;
    private ProvinciaDTO provincia;
    private UbicacionDTO ubicacion;
}
