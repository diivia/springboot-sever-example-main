package com.kn.kulygin.springbootserverexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.kn.kulygin.springbootserverexample.domain.TextKey;

public interface TextKeyRepository extends JpaRepository<TextKey, Long>, JpaSpecificationExecutor<TextKey> {
}
