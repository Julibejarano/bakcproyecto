package com.contrato.contrato.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContractDTO {
    private Long id;
    private String identifier;
    private Double value;
    private String contractorName;
    private String contractorDocument;
    private String contracteeName;
    private String contracteeDocument;
    private LocalDate startDate;
    private LocalDate endDate;
}
