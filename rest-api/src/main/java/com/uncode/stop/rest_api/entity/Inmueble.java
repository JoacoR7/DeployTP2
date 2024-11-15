package com.uncode.stop.rest_api.entity;

import java.util.UUID;

import org.hibernate.annotations.SoftDelete;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import com.uncode.stop.rest_api.service.Identifiable;

@Getter
@Setter
@Entity
@SoftDelete(columnName = "eliminado")
public class Inmueble implements Identifiable<UUID> {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotBlank
    @Column(nullable = false)
    private String numeracion;

    @NotBlank
    @Column(nullable = false)
    private String piso;

    @NotBlank
    @Column(nullable = false)
    private String depto;

    @NotNull
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private EstadoInmueble estadoInmueble;

    @NotNull
    @ManyToOne(optional = false)
    private UnidadDeNegocio unidadDeNegocio;

}