package com.skcc.demo.domain.repository;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import com.skcc.demo.domain.entity.OauthRefreshToken;

public class OauthRefreshTokenRepositorySupportImpl extends QuerydslRepositorySupport
		implements OauthRefreshTokenRepositorySupport {
	public OauthRefreshTokenRepositorySupportImpl() {
		super(OauthRefreshToken.class);
	}
}
