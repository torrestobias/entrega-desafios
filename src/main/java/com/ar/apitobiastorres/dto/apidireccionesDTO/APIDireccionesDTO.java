package com.ar.apitobiastorres.dto.apidireccionesDTO;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
public class APIDireccionesDTO {

    private Integer cantidad;
    @SerializedName("direccionesDTO")
    private List<DireccionesDTO> direccionesDTO;
    private Integer inicio;
    private ParametrosDTO parametrosDTO;
    private Integer total;

}
