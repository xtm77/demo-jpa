package com.skcc.demo.domain.repository;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import com.skcc.demo.domain.entity.OauthApprovals;

public class OauthApprovalsRepositorySupportImpl extends QuerydslRepositorySupport
		implements OauthAccessTokenRepositorySupport {

	public OauthApprovalsRepositorySupportImpl() {
		super(OauthApprovals.class);
	}
}
