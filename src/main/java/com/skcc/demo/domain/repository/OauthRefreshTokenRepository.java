package com.skcc.demo.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skcc.demo.domain.entity.OauthRefreshToken;

public interface OauthRefreshTokenRepository extends JpaRepository<OauthRefreshToken, String> {

}
