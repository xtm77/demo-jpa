package com.skcc.demo.domain.entity;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
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
@EqualsAndHashCode(callSuper = false)
public class OauthAccessToken {

	@Id
	private String tokenId;
	
	@Lob
	private Blob token;
	private String authenticationId;
	private String userName;
	private String clientId;
	@Lob
	private Blob authentication;
	
	
	private String refreshToken;
}
