package com.skcc.demo.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skcc.demo.domain.entity.Client;

public interface ClientRepository extends JpaRepository<Client, String>, ClientRepositorySupport {

}
