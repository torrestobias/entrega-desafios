package com.ar.apitobiastorres.dto.apidireccionesDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Data
public class ParametrosDTO {

    private DireccionParametrosDTO direccionDTO;
    private String provincia;

}
