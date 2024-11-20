package com.contrato.contrato.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Entity
@Table(name = "Contrato")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "Identificador")
    private String identifier;

    @Column(name = "Valor")
    private Double value;

    @Column(name = "nombre_contratante")
    private String contractorName;

    @Column(name = "documento_contratante")
    private String contractorDocument;

    @Column(name = "nombre_contratantista")
    private String contracteeName;

    @Column(name = "documento_contratantista")
    private String contracteeDocument;

    @Column(name = "fecha_inicial")
    private LocalDate startDate;

    @Column(name = "fecha_final")
    private LocalDate endDate;
}