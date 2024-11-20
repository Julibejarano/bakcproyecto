package com.contrato.contrato.service;

import com.contrato.contrato.dto.ContractDTO;
import com.contrato.contrato.entity.Contract;
import com.contrato.contrato.repository.ContractRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ContractService {
    private final ContractRepository contractRepository;
    private final ModelMapper modelMapper;

    public ContractDTO createContract(ContractDTO contractDTO) {
        Contract contract = modelMapper.map(contractDTO, Contract.class);
        Contract savedContract = contractRepository.save(contract);
        return modelMapper.map(savedContract, ContractDTO.class);
    }

    public ContractDTO updateContract(Long id, ContractDTO contractDTO) {
        Contract existingContract = contractRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Contract not found"));
        
        modelMapper.map(contractDTO, existingContract);
        Contract updatedContract = contractRepository.save(existingContract);
        return modelMapper.map(updatedContract, ContractDTO.class);
    }

    public void deleteContract(Long id) {
        contractRepository.deleteById(id);
    }

    public List<ContractDTO> getAllContracts() {
        return contractRepository.findAll().stream()
            .map(contract -> modelMapper.map(contract, ContractDTO.class))
            .collect(Collectors.toList());
    }

    public ContractDTO getContractById(Long id) {
        Contract contract = contractRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Contract not found"));
        return modelMapper.map(contract, ContractDTO.class);
    }
}
