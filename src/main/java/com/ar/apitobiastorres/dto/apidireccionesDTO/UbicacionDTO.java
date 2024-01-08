package com.ar.apitobiastorres.dto.apidireccionesDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Data
public class UbicacionDTO {

    private Integer lat;
    private Integer lon;

}
