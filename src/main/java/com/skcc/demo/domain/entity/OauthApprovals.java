package com.skcc.demo.domain.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.IdClass;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@IdClass(OauthApprovalsPk.class)
@Builder
public class OauthApprovals {

	@Id
	@Column(name = "userId")
	private String userId;
	@Id
	@Column(name = "clientId")
	private String clientId;
	
	private String scope;
	
	@Enumerated(EnumType.STRING)
	private ApprovalStatus status;
	
	@Column(name = "expiresAt")
	private LocalDateTime expiresAt;
	@Column(name = "lastModifiedAt")
	private LocalDateTime lastModifiedAt;
	
	//expiresAt,status,lastModifiedAt,userId,clientId,scope
	
}
