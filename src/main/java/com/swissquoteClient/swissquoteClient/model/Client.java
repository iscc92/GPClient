package com.swissquoteClient.swissquoteClient.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Client")
@Data

public class Client {
	
	
	Client() {	
	}
	
	
	public Client(String name, Integer nif) {
		this.name = name;
		this.nif = nif;
	}
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	private Integer nif; 
}
