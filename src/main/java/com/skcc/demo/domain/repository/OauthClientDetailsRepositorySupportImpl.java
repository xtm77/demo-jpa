package com.skcc.demo.domain.repository;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import com.skcc.demo.domain.entity.OauthClientDetails;

public class OauthClientDetailsRepositorySupportImpl extends QuerydslRepositorySupport
		implements OauthClientDetailsRepositorySupport {
	public OauthClientDetailsRepositorySupportImpl() {
		super(OauthClientDetails.class);
	}
}
