package com.ar.apitobiastorres.dto.apidireccionesDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Data
public class DireccionParametrosDTO {

    private AlturaDTO alturaDTO;
    private List<String> calles;
    private String piso;
    private String tipo;
}
