package com.skcc.demo.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skcc.demo.domain.entity.OauthClientDetails;

public interface OauthClientDetailsRepository extends JpaRepository<OauthClientDetails, String>{

}
