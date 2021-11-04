package com.example.poctransfer.data_access.repositories;

import com.example.poctransfer.data_access.repositories.entities.Transfer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface TransferRepository extends JpaRepository<Transfer, BigInteger> {
}
