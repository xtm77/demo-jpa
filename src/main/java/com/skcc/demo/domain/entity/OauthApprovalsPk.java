package com.skcc.demo.domain.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@SuppressWarnings("serial")
@Builder
public class OauthApprovalsPk implements Serializable {
	
	private String userId;
	private String clientId;

	@Override
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		if (getClass() != o.getClass()) {
			return false;
		}
		
		if (this == o) {
			return true;
		}
		
		OauthApprovalsPk that = OauthApprovalsPk.class.cast(o);
		if (userId.equals(that.getUserId()) && clientId.equals(that.getClientId())) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int hashCode = 1;
		hashCode = prime * hashCode + ((userId == null)? 0: userId.hashCode());
		hashCode = prime * hashCode + ((clientId == null)? 0: clientId.hashCode());
		return hashCode;
	}
}
