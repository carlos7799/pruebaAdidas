package com.prueba.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TASK")
public class Subscription {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="IDCAMPAING")
	private String idCampaing;
	@Column(name="EMAIL")
	private String email;
	@Column(name="FIRTSNAME")
	private String firtsname;
	@Column(name="DATEBIRTH")
	private Date dateBirth;
	@Column(name="STATUS")
	private String status;
	
	
	public Subscription(){}
	
	@Id
	public Long getId() {
		return id;
	}
	@Id
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getIdCampaing() {
		return idCampaing;
	}

	public void setIdCampaing(String idCampaing) {
		this.idCampaing = idCampaing;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirtsname() {
		return firtsname;
	}

	public void setFirtsname(String firtsname) {
		this.firtsname = firtsname;
	}

	public Date getDateBirth() {
		return dateBirth;
	}

	public void setDateBirth(Date dateBirth) {
		this.dateBirth = dateBirth;
	}
}
