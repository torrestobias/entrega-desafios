package com.ar.apitobiastorres.dto.apidireccionesDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class DireccionNormalizadaDTO {

    private List<String> direccionNormalizada;

    public DireccionNormalizadaDTO() {
        direccionNormalizada = new ArrayList<>();
    }
}
