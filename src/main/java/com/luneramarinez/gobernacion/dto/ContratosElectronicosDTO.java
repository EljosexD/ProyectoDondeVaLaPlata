package com.luneramarinez.gobernacion.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data 
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContratosElectronicosDTO {
    private String ciudad;
    private String orden;
    private String sector;
    @JsonProperty("estado_contrato")
    private String estadoObra;
    @JsonProperty("direcci_n_de_ejecuci_n_del_contrato")
    private String dirrecionContrato;
    @JsonProperty("fecha_de_inicio_del_contrato")
    private String fechaInicio;
    @JsonProperty("fecha_de_fin_del_contrato")
    private String fechaFinal;
    @JsonProperty("ultima_actualizacion")
    private String fechaActualizacion;
    @JsonProperty("valor_del_contrato")
    private double valorObra;
    @JsonProperty("valor_pagado")
    private double valorPagado;
    @JsonProperty("urlproceso")
    private Url url;
    @JsonProperty("descripcion_del_proceso")
    private String descripcionDelProceso;
    @Data 
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Url{
        private String url;
    }
}
