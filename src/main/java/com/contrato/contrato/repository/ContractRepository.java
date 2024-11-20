package com.contrato.contrato.repository;

import com.contrato.contrato.entity.Contract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractRepository extends JpaRepository<Contract, Long> {
    Contract findByIdentifier(String identifier);
}