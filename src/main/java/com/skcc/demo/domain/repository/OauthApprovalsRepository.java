package com.skcc.demo.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skcc.demo.domain.entity.OauthApprovals;
import com.skcc.demo.domain.entity.OauthApprovalsPk;

public interface OauthApprovalsRepository extends JpaRepository<OauthApprovals, OauthApprovalsPk> {

}
