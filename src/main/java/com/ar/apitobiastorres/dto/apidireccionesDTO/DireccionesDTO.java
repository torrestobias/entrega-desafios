package com.ar.apitobiastorres.dto.apidireccionesDTO;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
public class DireccionesDTO {

    @SerializedName("altura")
    private AlturaDTO altura;
    @SerializedName("calle")
    private CalleDTO calle;
    @SerializedName("calle_cruce_1")
    private CalleCruceDTO calle_cruce_1;
    @SerializedName("calle_cruce_2")
    private CalleCruceDTO calle_cruce_2;
    @SerializedName("departamento")
    private DepartamentoDTO departamento;
    @SerializedName("localidad_censal")
    private LocalidadCensalDTO localidad_censal;
    @SerializedName("nomenclatura")
    private String nomenclatura;
    @SerializedName("piso")
    private String piso;
    @SerializedName("provincia")
    private ProvinciaDTO provincia;
    @SerializedName("ubicacion")
    private UbicacionDTO ubicacion;
}
