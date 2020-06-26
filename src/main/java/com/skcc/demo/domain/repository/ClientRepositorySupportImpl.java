package com.skcc.demo.domain.repository;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import com.skcc.demo.domain.entity.Client;

public class ClientRepositorySupportImpl extends QuerydslRepositorySupport implements ClientRepositorySupport {

	public ClientRepositorySupportImpl() {
		super(Client.class);
	}

}
