package com.skcc.demo.domain.repository;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import com.skcc.demo.domain.entity.OauthAccessToken;

public class OauthAccessTokenRepositorySupportImpl extends QuerydslRepositorySupport implements OauthAccessTokenRepositorySupport {

	public OauthAccessTokenRepositorySupportImpl() {
		super(OauthAccessToken.class);
	}

}
