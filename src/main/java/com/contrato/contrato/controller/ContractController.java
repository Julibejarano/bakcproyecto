package com.contrato.contrato.controller;

import com.contrato.contrato.dto.ContractDTO;
import com.contrato.contrato.service.ContractService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/contracts")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class ContractController {
    private final ContractService contractService;

    @PostMapping
    public ResponseEntity<ContractDTO> createContract(@RequestBody ContractDTO contractDTO) {
        return ResponseEntity.ok(contractService.createContract(contractDTO));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ContractDTO> updateContract(@PathVariable Long id, @RequestBody ContractDTO contractDTO) {
        return ResponseEntity.ok(contractService.updateContract(id, contractDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteContract(@PathVariable Long id) {
        contractService.deleteContract(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<ContractDTO>> getAllContracts() {
        return ResponseEntity.ok(contractService.getAllContracts());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ContractDTO> getContractById(@PathVariable Long id) {
        return ResponseEntity.ok(contractService.getContractById(id));
    }
}