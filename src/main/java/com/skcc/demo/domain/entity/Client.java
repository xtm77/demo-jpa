package com.skcc.demo.domain.entity;

import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

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
public class Client extends AuditorEntity {

	@Id
	private String clientId;
	
//	@ElementCollection
//	@CollectionTable(name = "client_resource", joinColumns = @JoinColumn(name = "client_id"))
//	@Column(name = "resource_id")
//	private Set<String> resourceIds;
}
